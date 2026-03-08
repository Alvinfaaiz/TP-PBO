/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

/**
 *
 * @author ASUS A15
 */
public class Anggota {
    private String nama;
    private String idAnggota;
    private Buku buku;

    public boolean sedangMeminjam(){
        return buku != null;
    }
    
    public void kembalikan(){
        if (buku != null) {
            this.buku.setStatus(false);
            this.buku = null;
        }
    }
    
    public void pinjam(Buku buku) {
        this.buku = buku;
        this.buku.setStatus(true);
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        if(idAnggota.startsWith("A")){
            this.idAnggota = idAnggota;
        }else {
            this.idAnggota = "ID anggota yang Anda masukkan salah";
        }
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
    public String printStatus(){
        if (sedangMeminjam() == true){
            return "Sedang meminjam buku " + getBuku().getJudul();
        }else {
            return "Tidak sedang meminjam buku";
        }
    }
}
