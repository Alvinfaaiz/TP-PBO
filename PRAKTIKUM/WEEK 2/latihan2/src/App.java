import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    int umur;
    String jurusan;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setIPK(double ipk){
        if (ipk >= 4.0){
            System.out.println("Ipk ga ada yang lebih dari 4.0 dongo");
        }else{
            this.ipk = ipk;
        }
    }

    public void display(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}

class Dosen {
    private String nama;
    private String nidn;
    private String jurusan;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIDN(String nidn){
        this.nidn = nidn;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void display(){
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + nidn);
        System.out.println("Jurusan: " + jurusan);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("===========Masukkan data mahasiswa===========");
        System.out.print("Masukkan nama mahasiswa: ");
        mhs1.setNama(input.nextLine());
        System.out.print("Masukkan NIM mahasiswa: ");
        mhs1.setNIM(input.nextLine());
        System.out.print("Masukkan IPK mahasiswa: ");
        mhs1.setIPK(input.nextDouble());

        mhs1.display();
    }
}
