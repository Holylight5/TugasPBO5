
package pbo5;


public class Orang {
    private String nama;
    private String alamat;

    public Orang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getName(){
        return this.nama;
    }

    public String getAddress(){
        return this.alamat;
    }

    public void setName(String alamat){
        this.alamat = alamat;
    }

    public String toString(){
        return
        "Nama : " + getName() +
        "\nAlamat : " + getAddress();
    }
}
