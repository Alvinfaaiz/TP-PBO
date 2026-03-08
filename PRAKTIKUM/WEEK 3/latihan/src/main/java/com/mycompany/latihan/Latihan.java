/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan;

/**
 *
 * @author ASUS A15
 */
public class Latihan {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Siti Rahayu","103023400101",3.85, "Informatika");
        Prodi pr1 = new Prodi(mhs1);
        Mahasiswa mhs2 = new Mahasiswa("Budi Prakoso","103123300067",2.9, "Rekayasa Perangkat Lunak");
        Prodi pr2 = new Prodi(mhs2);
        Mahasiswa mhs3 = new Mahasiswa("Dewi Anggraini","103224400203",3.50, "Sains Data");
        Prodi pr3 = new Prodi(mhs3);
        Mahasiswa mhs4 = new Mahasiswa("Reza Firmansyah","103324300009",3.10, "Informatika");
        Prodi pr4 = new Prodi(mhs4);
        
        System.out.println("Nama     :" + mhs1.getNama());
        System.out.println("NIM      :" + mhs1.getNim());
        System.out.println("IPK      :" + mhs1.getIpk());
        System.out.println("Jurusan  :" + mhs1.getJurusan()+" "+pr1.getKode());
        System.out.println("Angaktan :" + mhs1.getAngkatan());
        
        System.out.println("");
        System.out.println("Nama     :" + mhs2.getNama());
        System.out.println("NIM      :" + mhs2.getNim());
        System.out.println("IPK      :" + mhs2.getIpk());
        System.out.println("Jurusan  :" + mhs2.getJurusan()+" "+pr2.getKode());
        System.out.println("Angaktan :" + mhs2.getAngkatan());
        
        System.out.println("");
        System.out.println("Nama     :" + mhs3.getNama());
        System.out.println("NIM      :" + mhs3.getNim());
        System.out.println("IPK      :" + mhs3.getIpk());
        System.out.println("Jurusan  :" + mhs3.getJurusan()+" "+pr3.getKode());
        System.out.println("Angaktan :" + mhs3.getAngkatan());
        
        System.out.println("");
        System.out.println("Nama     :" + mhs4.getNama());
        System.out.println("NIM      :" + mhs4.getNim());
        System.out.println("IPK      :" + mhs4.getIpk());
        System.out.println("Jurusan  :" + mhs4.getJurusan()+" "+pr4.getKode());
        System.out.println("Angaktan :" + mhs4.getAngkatan());
        
        
    }
}
