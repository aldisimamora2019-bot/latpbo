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

public class TantanganPolimorfisme {
    public static void main(String[] args) {
        // Array bertipe parent, diisi objek child yang berbeda-beda
        KendaraanEkspedisi[] armada = {
            new TrukBox("B 9081 TXT", 5000),
            new MobilVan("B 1122 KAA", 800),
            new MotorKurir("BK 5555 DEL", 50)
        };
 
        // Satu for-loop: JVM memilih angkutBarang() sesuai objek aslinya
        // tanpa instanceof atau pengecekan tipe manual
        for (KendaraanEkspedisi k : armada) {
            k.angkutBarang("Paket Umum");
        }
    }
}
