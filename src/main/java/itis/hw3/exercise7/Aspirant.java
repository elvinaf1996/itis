package itis.hw3.exercise7;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if (averageMark >= 4.7) {
            return 5600;
        } else if (averageMark >= 3.7) {
            return 3300;
        }

        return 0;
    }
}
