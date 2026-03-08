/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

/**
 *
 * @author ASUS A15
 */
public class Buku {
    private String judul;
    private String kodeBuku;
    private String penulis;
    private boolean status;
    Kategori kategori;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        if (judul == null){
            this.judul = "Inputan tidak valid";
        }else {
            this.judul = judul;
        }
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        if (kodeBuku == null){
            this.judul = "Inputan tidak valid";
        }else {
            this.kodeBuku = kodeBuku;
        }
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        if (penulis == null){
            this.penulis = "Inputan tidak valid";
        }else {
            this.penulis = penulis;
        }
    }

    public Kategori getKategori() {
        String kodeAwal = kodeBuku.substring(0,3);
        Kategori k = new Kategori();
        
        if (kodeAwal.equals("FIK")){
            k.setKode("FIK");
            k.setNama("Fiksi");
        } else if (kodeAwal.equals("ILM")){
            k.setKode("ILM");            
            k.setNama("Ilmu Pengetahuan");
        }else if (kodeAwal.equals("TEK")){
            k.setKode("TEK");            
            k.setNama("Teknologi");
        }else if (kodeAwal.equals("SEJ")){
            k.setKode("SEJ");            
            k.setNama("Sejarah");
        }else{
            k.setKode("Kode tidak ada dalam daftar");
            k.setNama("Tidak deiketahui");
        }
        return k;
    }
    
    public String getTahunTerbit(){
        String tahun = kodeBuku.substring(4,6);
        
        return "20" + tahun;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String printStatus(){
        if (isStatus() == true){
            return "Buku sedang dipinjam";
        }else{
            return "Buku tersedia";
        }
    }
}
