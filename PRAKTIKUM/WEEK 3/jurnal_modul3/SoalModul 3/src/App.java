import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MataKuliah pbo = new MataKuliah("CII3B4", "Pemrograman Berorientasi Objek", 4);
        MataKuliah kalkulus = new MataKuliah("CII2A3", "Kalkulus", 3);
        MataKuliah dka = new MataKuliah("CII1F4", "Dasar Kecerdasan Artifisial", 4);
        MataKuliah kwu = new MataKuliah("UKI2A2", "Kewirausahaan", 2);

        Mahasiswa mhs1 = new Mahasiswa("103012330004", "Historia", 1);
        Mahasiswa mhs2 = new Mahasiswa("103012310024", "Sasha", 12);
        Mahasiswa mhs3 = new Mahasiswa("103012320012", "Falco", 5);

        mhs1.tambahMK(new AmbilMK(pbo,      "A",  "21/22"));
        mhs1.tambahMK(new AmbilMK(kalkulus, "A",  "09/10"));
        mhs1.tambahMK(new AmbilMK(dka,      "A",  "09/10"));
        mhs1.tambahMK(new AmbilMK(kwu,      "A",  "21/22"));
        
        
        mhs2.tambahMK(new AmbilMK(pbo,      "B",  "21/22"));
        mhs2.tambahMK(new AmbilMK(kalkulus, "A",  "19/20"));
        mhs2.tambahMK(new AmbilMK(dka,      "BC", "19/20"));
        mhs2.tambahMK(new AmbilMK(kwu,      "AB", "21/22"));


        mhs3.tambahMK(new AmbilMK(pbo,      "AB", "22/23"));
        mhs3.tambahMK(new AmbilMK(kalkulus, "D",  "21/22"));
        mhs3.tambahMK(new AmbilMK(dka,      "B",  "21/22"));
        mhs3.tambahMK(new AmbilMK(kwu,      "C",  "22/23"));


        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = {mhs1, mhs2, mhs3};


           while (true) {
            System.out.print("Masukkan Tahun Ajaran (ketik q untuk exit program): ");
            String input = sc.nextLine();

            if (input.equals("q")) break;

            boolean adaData = false;

            for (Mahasiswa mhs : daftarMahasiswa) {
                double ipk = mhs.hitungIPK(input);
                if (ipk > 0) {
                    System.out.println("IPK " + mhs.getNama() +
                        " (" + mhs.getKelas() + "): " + ipk);
                    adaData = true;
                }
            }

            if (!adaData) {
                System.out.println("Tidak ada histori nilai pada Tahun Ajaran ini");
            }

            System.out.println();
        }
    }
}
