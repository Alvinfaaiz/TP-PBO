/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan3;

/**
 *
 * @author ASUS A15
 */
public class Toko {
    private String nama;
    private Buku buku;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public String infoBuku(){
        return "Toko    : " + nama +
               "\nJudul   : " + buku.getJudul() +
               "\nHarga   : " + buku.getHarga() +
               "\nStok    : " + buku.getStok() +
               "\nStatus  : " + buku.tersedia();
    }
}
