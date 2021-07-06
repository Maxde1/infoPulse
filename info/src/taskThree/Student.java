package taskThree;

public class Student extends Human{
    private int course;
    public Student(String name, String surname, int age, int course){
        super(name, surname, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }
}
