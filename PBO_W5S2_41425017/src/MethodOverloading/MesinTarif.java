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

class MesinTarif {
    private String kotaAsal; // kota asal pengiriman (dienkapsulasi)
 
    // Constructor: mengisi kota asal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }
 
    //ongkir dasar berdasarkan berat saja (Rp10.000 per kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }
 
    //ongkir + asuransi 1% dari nilai barang
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01; // biaya asuransi
        return (beratKg * 10000) + biayaAsuransi;
    }
 
    //ongkir dengan opsi express (tambahan Rp20.000)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000; // tarif dasar
        if (isExpress) {
            total += 20000; // biaya prioritas kilat
        }
        return total;
    }
}
 

