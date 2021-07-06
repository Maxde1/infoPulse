package taskThree;

public class Subject {
    private String nameOfSubject;
    private int numberOfHour;

    public Subject(String nameOfSubject, int numberOfHour) {
        this.nameOfSubject = nameOfSubject;
        this.numberOfHour = numberOfHour;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public int getNumberOfHour() {
        return numberOfHour;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameOfSubject='" + nameOfSubject + '\'' +
                ", numberOfHour=" + numberOfHour +
                '}';
    }
}
