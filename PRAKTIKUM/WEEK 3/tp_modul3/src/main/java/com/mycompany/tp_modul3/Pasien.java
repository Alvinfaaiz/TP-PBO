/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_modul3;

/**
 *
 * @author ASUS A15
 */
public class Pasien {
    private String nama;
    private int umur; 
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public Pasien (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
