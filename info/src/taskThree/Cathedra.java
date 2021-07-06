package taskThree;

import java.util.ArrayList;

public class Cathedra {
    private String nameOfCathedra;
    private ArrayList<Group> groups = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public Cathedra(String nameOfCathedra, ArrayList<Group> groups, ArrayList<Teacher> teachers) {
        if (groups.size() >= 1 && teachers.size() >=3){
            this.nameOfCathedra = nameOfCathedra;
            this.groups = groups;
            this.teachers = teachers;
        }
        else if (groups.size() < 1 && teachers.size() < 3){
            throw new IllegalArgumentException("Group array is empty and size of teacher array less that 3 elements");
        }
        else if (groups.size() < 1){
            throw new IllegalArgumentException("Group array is empty");
        }
        else {
            throw new IllegalArgumentException("Size of teacher array less that 3 elements");
        }
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public String getNameOfCathedra() {
        return nameOfCathedra;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
