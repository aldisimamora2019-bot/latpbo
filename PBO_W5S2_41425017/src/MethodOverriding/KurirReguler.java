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

class KurirReguler {
    protected String nama; // nama kurir, bisa diakses subclass
 
    public KurirReguler(String nama) {
        this.nama = nama;
    }
 
    // Method yang akan di-override oleh child class
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}