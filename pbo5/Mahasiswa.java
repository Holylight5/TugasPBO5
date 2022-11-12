
package pbo5;

import java.util.ArrayList;

public class Mahasiswa extends Orang {
    private int jmlhmatkul;
    private ArrayList<String> matkul;
    private ArrayList<Integer> nilailList;

    public Mahasiswa (String name, String address){
        super(name, address);
        matkul = new ArrayList<>();
        nilailList = new ArrayList<>();
        
    }

    public void addmatkulGrade(String matkul, int grade){
        this.matkul.add(matkul);
        this.nilailList.add(grade);
        jmlhmatkul++;
        
    }

    public void printnilailList(){
        for(int i = 0; i < jmlhmatkul; i++){
            System.out.println("matakuliah: " + matkul.get(i) + " " + "grade: " + nilailList.get(i));
        }
    }

    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < jmlhmatkul; i++) {
            jumlah += nilailList.get(i);
        }

        return jumlah / jmlhmatkul;
    }

    public String toString(){
        return
        super.toString() + 
        "Jumlah matkul yang diambil : " + this.jmlhmatkul + 
        "Rata-rata nilai : " + getAverageGrade();
    }
}
