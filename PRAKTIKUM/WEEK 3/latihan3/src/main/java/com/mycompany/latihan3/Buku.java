/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan3;

/**
 *
 * @author ASUS A15
 */
public class Buku {
    private String judul;
    private double harga;
    private int stok;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getHarga() {
        return harga;
    }

    public boolean setHarga(double harga) {
        if (harga < 0.0){
            return false;
        }
        this.harga = harga;
        return true;
  }

    public int getStok() {
        return stok;
    }

    public boolean setStok(int stok) {
        if(stok < 0){
            return false;
        }
        this.stok = stok;
        return true;
    }
    
    public boolean beli(int jumlah){
        if(jumlah > stok){
            return false;
        }
        stok = stok - jumlah;
        return true;
    }
    
    public boolean tersedia(){
        if(stok > 0){
            return true;
        }
        return false;
    }
}
