
package pbo5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("masukan nama dosen : ");
            String nama = sc.nextLine();
            System.out.print("masukan alamat : ");

            String alamat = sc.nextLine();

            Dosen dosen = new Dosen(nama, alamat);

            for(int i = 0; i < 2; i++){
                System.out.print("masukan mata kuliah yang diampu : ");
                String matkul = sc.nextLine();
                dosen.addCourse(matkul);
            }

            System.out.println(dosen);
        }

    } 
}
