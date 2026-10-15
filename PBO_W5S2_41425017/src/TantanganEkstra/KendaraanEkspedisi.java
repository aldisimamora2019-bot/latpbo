/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TantanganEkstra;

/**
 *
 * @author LENOVO
 */

/* 
Nama : Aldi Tulus Rio Simamora
NIM : 41425017
Prodi : D4-TRPL
*/

abstract class KendaraanEkspedisi {
    protected String noPolisi;   // plat nomor
    protected int kapasitasKg;   // daya angkut
 
    // Constructor dipanggil subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
 
    // Concrete method: dipakai bersama oleh semua subclass
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }
 
    // Abstract method: tanpa body, wajib diimplementasikan subclass konkret
    public abstract void angkutBarang(String namaBarang);
}
