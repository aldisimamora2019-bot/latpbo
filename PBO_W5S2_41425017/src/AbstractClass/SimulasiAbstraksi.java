/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author LENOVO
 */

/* 
Nama : Aldi Tulus Rio Simamora
NIM : 41425017
Prodi : D4-TRPL
*/

public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");
 
        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // (hapus tanda komentar untuk melihat error:
        //  "KendaraanEkspedisi is abstract; cannot be instantiated")
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
 
        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");
 
        System.out.println("---------------------------------");
 
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}
