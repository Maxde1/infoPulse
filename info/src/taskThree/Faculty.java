package taskThree;

import java.util.ArrayList;

public class Faculty {
    private String nameOfFaculty;
    private ArrayList<Cathedra> cathedras = new ArrayList<>();

    public Faculty(String nameOfFaculty, ArrayList<Cathedra> cathedra) {
        if (cathedra.size() >= 1){
            this.nameOfFaculty = nameOfFaculty;
            for (Cathedra c: cathedra){
                this.cathedras.add(c);
            }
        }
        else {
            throw new IllegalArgumentException("cathedra array has less that one element");
        }
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public ArrayList<Cathedra> getCathedras() {
        return cathedras;
    }
    public void setCathedras(ArrayList<Cathedra> ca){
        for (Cathedra c: ca){
            if (!this.cathedras.contains(ca)){
                this.cathedras.add(c);
            }
        }
    }

    public void setCathedras(Cathedra ca){
        if (!this.cathedras.contains(ca)){
            this.cathedras.add(ca);
        }
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameOfFaculty='" + nameOfFaculty + '\'' +
                ", cathedras=" + cathedras +
                '}';
    }
}
