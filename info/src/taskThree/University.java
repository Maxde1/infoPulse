package taskThree;

import java.util.ArrayList;

public class University {
    private String namOfUniversity;
    private ArrayList<Faculty> faculties = new ArrayList<>();
    private ArrayList<Subject> subjects = new ArrayList<>();

    public University(String namOfUniversity, ArrayList<Faculty> faculty) {
        this.namOfUniversity = namOfUniversity;
        this.faculties = faculty;
    }
    public University(String namOfUniversity, ArrayList<Faculty> faculty, ArrayList<Subject> subject) {
        this.namOfUniversity = namOfUniversity;
        this.faculties = faculty;
        this.subjects = subject;
    }
    public University(String namOfUniversity) {
        this.namOfUniversity = namOfUniversity;
    }
    public void setSubjects(ArrayList<Subject> subject){
        for (Subject s: subject){
            if (!this.subjects.contains(s)){
                this.subjects.add(s);
            }
        }
    }
    public void setSubjects(Subject subject){
        if(!this.subjects.contains(subject)){
            this.subjects.add(subject);
        }
    }
    public void setFaculty(ArrayList<Faculty> faculty){
        for (Faculty f: faculty){
            if (!this.faculties.contains(f)){
                this.faculties.add(f);
            }
        }
    }
    public void setFaculty(Faculty faculty){
        if(!this.faculties.contains(faculty)){
            this.faculties.add(faculty);
        }
    }

    public String getNamOfUniversity() {
        return namOfUniversity;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "University{" +
                "namOfUniversity='" + namOfUniversity + '\'' +
                ", faculties=" + faculties +
                ", subjects=" + subjects +
                '}';
    }
}
