/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author LENOVO
 */

/* 
Nama : Aldi Tulus Rio Simamora
NIM : 41425017
Prodi : D4-TRPL
*/

public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("=== INI METHOD LOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)    : Rp  " + tarif.hitungOngkir (2.0));
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp" + tarif.hitungOngkir(2.0, 5000000.0));   
    }
    
}
