/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3;

/**
 *
 * @author ASUS A15
 */
public class Latihan3 {

    public static void main(String[] args) {
        Buku b1 = new Buku();
        
        b1.setJudul("Pemrograman Jaya");
        b1.setHarga(85000);
        b1.setStok(10);
        
        Toko t1 = new Toko();
        t1.setNama("Toko Buku Maju");
        t1.setBuku(b1);
        
        System.out.println("====="+t1.getNama()+"=====");
        
        System.out.println(t1.infoBuku());
        
        System.out.println("=====TRASAKSI=====");
        b1.beli(3);
        System.out.println("Beli buku 3:" + "\nStok sekarang " + b1.getStok());
        b1.beli(80);
        System.out.println("Beli buku 8:" + "\nStok sekarang " + b1.getStok());
        
    }
}
