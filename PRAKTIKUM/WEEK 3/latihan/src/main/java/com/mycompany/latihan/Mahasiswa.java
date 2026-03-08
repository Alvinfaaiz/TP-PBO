/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan;

/**
 *
 * @author ASUS A15
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;
    private String jurusan;
    
    public Mahasiswa(String nama, String nim, double ipk, String jurusan){
        setNama(nama);
        setNim(nim);
        setIpk(ipk);
        setJurusan(jurusan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null){
            System.out.println("Inputan tidak valid");
            this.nama = " ";
        }else{
            this.nama = nama;
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim == null){
            System.out.println("Inputan tidak valid");
            this.nim = " ";
        }else{
            this.nim = nim;
        }
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0){
            System.out.println("Nilai yang Anda masukkan tidak valid");
            this.ipk = 9999;
        }else{
            this.ipk = ipk;
        }
    }
    
    public String getAngkatan(){
        String angkatan = getNim().substring(5,7);
        return "20"+angkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null){
            System.out.println("Inputan tidak valid");
            this.jurusan = " ";
        }else{
            this.jurusan = jurusan;
        }
    }
}
