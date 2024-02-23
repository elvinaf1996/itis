package itis.hw3.exercise7;

public class Student {

    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark >= 4.7) {
            return 3200;
        } else if (averageMark >= 3.7) {
            return 2100;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName= '" + firstName + "'" +
                ", lastName= '" + lastName + "'" +
                ", group= '" + group + "'" +
                ", averageMark= '" + averageMark + "'" +
                ", scholarship= '" + getScholarship() + "'" +
                '}';
    }
}
