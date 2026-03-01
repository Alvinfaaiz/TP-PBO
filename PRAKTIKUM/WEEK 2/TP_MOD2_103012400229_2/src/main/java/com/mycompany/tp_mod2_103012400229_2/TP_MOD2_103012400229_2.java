/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod2_103012400229_2;

/**
 *
 * @author ASUS A15
 */

class Mahasiswa { 
    
    private String nama;
    private String prodi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void displayMahasiswa() {
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println();
    }
}

public class TP_MOD2_103012400229_2 {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        mhs1.setNama("Reza Arap");
        mhs1.setProdi("Informatika");

        mhs2.setNama("Reza Auditore");
        mhs2.setProdi("Sistem Informasi");

        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}


