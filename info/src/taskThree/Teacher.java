package taskThree;

import java.util.ArrayList;

public class Teacher extends Human {
    private ArrayList<Subject> subjectOfTeacher = new ArrayList<>();
    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }
    public void setSubjectOfTeacher(Subject sub){
        subjectOfTeacher.add(sub);
    }
    public void setSubjectOfTeacher(ArrayList<Subject> sub){
        if (!sub.isEmpty()){
            for (Subject s: sub){
                subjectOfTeacher.add(s);
            }
        }
    }

    public ArrayList<Subject> getSubjectOfTeacher() {
        return subjectOfTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjectOfTeacher=" + subjectOfTeacher +
                '}';
    }
}
