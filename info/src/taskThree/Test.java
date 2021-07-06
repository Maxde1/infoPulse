package taskThree;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Create object of every class
        Student s1 = new Student("MAx", "Den", 12, 2);
        Student s2 = new Student("MAx", "Den", 12, 2);
        Student s3 = new Student("MAx", "Den", 12, 2);
        Student s4 = new Student("MAx", "Den", 12, 2);
        Student s5 = new Student("MAx", "Den", 12, 2);
        Student s6 = new Student("MAx", "Den", 12, 2);
        Teacher t1 = new Teacher("Chris", "Don" , 56);
        Teacher t2 = new Teacher("Chris", "Don" , 56);
        Teacher t3 = new Teacher("Chris", "Don" , 56);
        ArrayList<Teacher> listOfTeacher= new ArrayList<>();
        listOfTeacher.add(t1);
        listOfTeacher.add(t2);
        listOfTeacher.add(t3);
        ArrayList<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(s1);
        listOfStudent.add(s2);
        listOfStudent.add(s3);
        listOfStudent.add(s4);
        listOfStudent.add(s5);
        listOfStudent.add(s6);
        Group g1 = new Group(t1, "TZ", listOfStudent);
        Group g2 = new Group(t1, "TZ", listOfStudent);
        Group g3 = new Group(t1, "TZ", listOfStudent);
        ArrayList<Group> listOfGroup = new ArrayList<>();
        listOfGroup.add(g1);
        listOfGroup.add(g2);
        listOfGroup.add(g3);
        Cathedra c1= new Cathedra("Telecommunication Tecnogoly", listOfGroup, listOfTeacher);
        Cathedra c2= new Cathedra("Telecommunication Tecnogoly", listOfGroup, listOfTeacher);
        Cathedra c3= new Cathedra("Telecommunication Tecnogoly", listOfGroup, listOfTeacher);
        ArrayList<Cathedra> listOfCathedra= new ArrayList<>();
        listOfCathedra.add(c1);
        listOfCathedra.add(c2);
        listOfCathedra.add(c3);
        Faculty f1 = new Faculty("Faculty A", listOfCathedra);
        Faculty f2 = new Faculty("Faculty B", listOfCathedra);
        Faculty f3 = new Faculty("Faculty C", listOfCathedra);
        ArrayList<Faculty> listOfFaculty = new ArrayList<>();
        listOfFaculty.add(f1);
        listOfFaculty.add(f2);
        listOfFaculty.add(f3);
        Subject sub1 = new Subject("Math", 25);
        Subject sub2 = new Subject("Physic", 30);
        Subject sub3 = new Subject("Geo", 2);
        ArrayList<Subject> listOfSubject = new ArrayList<>();
        listOfSubject.add(sub1);
        listOfSubject.add(sub2);
        listOfSubject.add(sub3);
        University u1 = new University("KPI", listOfFaculty);
        //Testing



        // Test function getFaculty from University class
        for (Faculty f: u1.getFaculties()){
            System.out.println(f.getNameOfFaculty());
        }
        // Test function getGroup from class Cathedra
        for (Group g: c1.getGroups()){
            System.out.println(g);
        }

    }
}
