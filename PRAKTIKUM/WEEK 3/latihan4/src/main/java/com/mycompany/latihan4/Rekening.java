/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan4;

/**
 *
 * @author ASUS A15
 */
public class Rekening {
    private String nomorRek;
    private double saldo;
    private String pemilik;

    public String getNomorRek() {
        return nomorRek;
    }

    public boolean setNomorRek(String nomorRek) {
        if(nomorRek.substring(0,4) == "REK"){
            return false;
        }
        this.nomorRek = nomorRek;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    
}
