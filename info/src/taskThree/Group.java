package taskThree;

import java.util.ArrayList;

public class Group {
    private String nameOfGroup;
    private ArrayList<Subject> subjects = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private Teacher curator;



    public Group(Teacher curator, String nameOfGroup, ArrayList<Student> stud) {
        if (stud.size() >= 6 && stud.size() <=30){
            this.curator = curator;
            this.nameOfGroup = nameOfGroup;
            this.students = stud;
        }
        else if(stud.size() < 6){
            throw new IllegalArgumentException("There are less than 6 student is Array");
        }
        else {
            throw new IllegalArgumentException("There are more than 30 student is Array");
        }
    }
    public Group(Teacher curator, String nameOfGroup, ArrayList<Student> stud, ArrayList<Subject> sub) {
        if (stud.size() >= 6 && stud.size() <=30){
            if(!sub.isEmpty()){
                this.curator = curator;
                this.nameOfGroup = nameOfGroup;
                this.students = stud;
                this.subjects = sub;
            }
            else {
                throw new IllegalArgumentException("Subjects Array is empty");
            }

        }
        else if(stud.size() < 6){
            throw new IllegalArgumentException("There are less than 6 student is Array");
        }
        else {
            throw new IllegalArgumentException("There are more than 30 student is Array");
        }
    }

    public ArrayList<Student> getStudent() {
        return students;
    }

    public void setStudent(Student s){
        if (this.students.size() < 30){
            this.students.add(s);
        }

    }

    public void setSubjects(Subject sub){
        this.subjects.add(sub);
    }
    public void setSubjects(ArrayList<Subject> sub){
        for (Subject s: sub){

        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", subjects=" + subjects +
                ", students=" + students +
                ", curator=" + curator +
                '}';
    }
}
