/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_modul3;

/**
 *
 * @author ASUS A15
 */
public class Tp_modul3 {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter("Grisha", "Mata");
        Dokter dt2 = new Dokter("Faye", "Gigi");
        Dokter dt3 = new Dokter("Zeke", "Telinga");

        Pasien ps1 = new Pasien("Hostoria", 20);
        Pasien ps2 = new Pasien("Sasha", 37);
        Pasien ps3 = new Pasien("Petra", 55);

        Pemesanan[] daftar = new Pemesanan[5];

        daftar[0] = new Pemesanan(dt1, ps1, "Selasa");
        daftar[1] = new Pemesanan(dt2, ps1, "Kamis");
        daftar[2] = new Pemesanan(dt2, ps2, "Selasa");
        daftar[3] = new Pemesanan(dt3, ps2, "Jumat");
        daftar[4] = new Pemesanan(dt1, ps3, "Senin");
        

        for(int i = 0; i < daftar.length;i++){
            System.out.println("Urutan ke-" + (i+1));
            System.out.println("Nama Dokter   : " + daftar[i].getDokter().getNama());
            System.out.println("Spesialis     : " + daftar[i].getDokter().getSpesialis());
            System.out.println("Nama Pasien   : " + daftar[i].getPasien().getNama() + " (" + daftar[i].getPasien().getUmur() + ")");
            System.out.println("Hari          : " + daftar[i].getHari());
            System.out.println();
        }
    }
}
