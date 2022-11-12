
package pbo5;

import java.util.ArrayList;

public class Dosen extends Orang{
    private int jmlhmatkul;
    private ArrayList<String> matkulList;

    public Dosen(String name, String address){
        super(name, address);
        jmlhmatkul = 0;
        matkulList = new ArrayList<>();

    }

    public boolean addCourse(String course){

        if(matkulList.contains(course)){
            System.out.println("matkul ini sudah tersedia");
            return false;
        }

        jmlhmatkul++;
        matkulList.add(course);
        return true;
    }

    public boolean removeCourse(String course){

        if(!matkulList.contains(course)){
            System.out.println("matkul yang akan di hapus tidak tersedia");
            return false;
        }

        jmlhmatkul--;
        matkulList.remove(course);
        return true;
        
    }

    public int getjmlmatkul() {
        return jmlhmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\nJumlah mata kuliah yang diampu : " + getjmlmatkul();
    }

    
}
