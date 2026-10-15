/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverriding;

/**
 *
 * @author LENOVO
 */
/* 
Nama : Aldi Tulus Rio Simamora
NIM : 41425017
Prodi : D4-TRPL
*/

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
 
        // Tipe referensi sama (KurirReguler), objek aslinya berbeda
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");
 
        // JVM memilih method berdasarkan objek asli saat runtime
        k1.kirimBarang("Jl. Sudirman No. 10");   // versi KurirReguler
        k2.kirimBarang("Gedung Graha Lt. 5");    // versi KurirDrone
    }
}