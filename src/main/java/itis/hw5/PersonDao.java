package itis.hw5;

import java.sql.*;
import java.util.ArrayList;

public class PersonDao {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/shop";
    static final String USER = "postgres";
    static final String PASS = "1234";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Подключение прошло успешно");

        } catch (Exception e2) {
            System.out.println(e2);
        }

        return connection;
    }

    public static int save(Person person) {
        int status;

        try {
            Connection connection = PersonDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into crudexample (userName,userPass,userEmail,userCountry) values(?,?,?,?)");
            preparedStatement.setString(1, person.getUserName());
            preparedStatement.setString(2, person.getUserPass());
            preparedStatement.setString(3, person.getUserEmail());
            preparedStatement.setString(4, person.getUserCountry());
            status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return status;

    }

    public static ArrayList<Person> getAllPersons() {
        ArrayList<Person> arrayList = new ArrayList<>();

        try {
            Connection connection = PersonDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from crudexample");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt(1));
                person.setUserName(resultSet.getString(2));
                person.setUserPass(resultSet.getString(3));
                person.setUserEmail(resultSet.getString(4));
                person.setUserCountry(resultSet.getString(5));
                arrayList.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrayList;
    }

    public static int delete(int id) {
        int status;

        try {
            Connection connection = PersonDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from crudexample where id =?");
            preparedStatement.setInt(1, id);
            status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return status;
    }

    public static int update(Person updatetPerson) {
        int status;

        try {
            Connection connection = PersonDao.getConnection();
            String sql = """
                    update crudexample
                    set username = ?,
                    userpass = ?,
                    useremail = ?,
                    usercountry = ?
                    where id = ?
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updatetPerson.getUserName());
            preparedStatement.setString(2, updatetPerson.getUserPass());
            preparedStatement.setString(3, updatetPerson.getUserEmail());
            preparedStatement.setString(4, updatetPerson.getUserCountry());
            preparedStatement.setInt(5, updatetPerson.getId());

            status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return status;
    }
}
