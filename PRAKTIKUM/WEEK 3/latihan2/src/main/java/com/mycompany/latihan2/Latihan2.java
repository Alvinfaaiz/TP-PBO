/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan2;

/**
 *
 * @author ASUS A15
 */
public class Latihan2 {

    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.setJudul("Laskar Pelangi");
        b1.setKodeBuku("FIK-23-0011");
        b1.setPenulis("Andrea Hirata");
        
        Buku b2 = new Buku();
        b2.setJudul("Belajar Python dari Nol");
        b2.setKodeBuku("TEK-24-0031");
        b2.setPenulis("Andi Wijaya");

        Buku b3 = new Buku();
        b3.setJudul("Sapiens");
        b3.setKodeBuku("ILM-22-0087");
        b3.setPenulis("Yuval Noah Harari");
        
        System.out.println("===== DATA BUKU =====");
        System.out.println("Judul        : " + b1.getJudul());
        System.out.println("Kode Buku    : " + b1.getKodeBuku());
        System.out.println("Penulis      : " + b1.getPenulis());
        System.out.println("Tahun Terbit : " + b1.getTahunTerbit());
        System.out.println("Kategori     : " + "[" + b1.getKategori().getKode() + "] " + b1.getKategori().getNama());
        System.out.println("Status       : " + b1.printStatus());
        System.out.println();

        System.out.println("Judul        : " + b2.getJudul());
        System.out.println("Kode Buku    : " + b2.getKodeBuku());
        System.out.println("Penulis      : " + b2.getPenulis());
        System.out.println("Tahun Terbit : " + b2.getTahunTerbit());
        System.out.println("Kategori     : " + "[" + b2.getKategori().getKode() + "] " + b2.getKategori().getNama());
        System.out.println("Status       : " + b2.printStatus());
        System.out.println();
        
        System.out.println("Judul        : " + b3.getJudul());
        System.out.println("Kode Buku    : " + b3.getKodeBuku());
        System.out.println("Penulis      : " + b3.getPenulis());
        System.out.println("Tahun Terbit : " + b3.getTahunTerbit());
        System.out.println("Kategori     : " + "[" + b3.getKategori().getKode() + "] " + b3.getKategori().getNama());
        System.out.println("Status       : " + b3.printStatus());
        System.out.println();
        
        Anggota a1 = new Anggota();
        a1.setNama("Sepa");
        a1.setIdAnggota("A00456");
        
        Anggota a2 = new Anggota();
        a2.setNama("Udin");
        a2.setIdAnggota("A00456");
        
        a1.pinjam(b2);
        
        System.out.println("===== STATUS ANGGOTA =====");
        System.out.println("Nama     : " + a1.getNama());
        System.out.println("ID       : " + a1.getIdAnggota());
        System.out.println("Status   : " + (a1.printStatus()));
        
        System.out.println("Hello World!");
    }
}
