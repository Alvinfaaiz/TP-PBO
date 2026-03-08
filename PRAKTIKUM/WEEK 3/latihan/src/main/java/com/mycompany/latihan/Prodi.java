/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan;

/**
 *
 * @author ASUS A15
 */
public class Prodi {
    private String kode;
    private String nama;
    private Mahasiswa mahasiswa;

    public Prodi(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    
    public String getKode() {
        String nim = mahasiswa.getNim().substring(0,4);
        if (nim.equals("1030")){
            return "[IF]";
        }else if(nim.equals("1031")){
            return "[SE]";
        }else if(nim.equals("1032")){
            return "[DS]";
        }else{
            return "[Kode tidak dikenali]"; 
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null){
            System.out.println("Inputan tidak valid");
            this.nama = " ";
        }
        this.nama = nama;
    }
    
}
