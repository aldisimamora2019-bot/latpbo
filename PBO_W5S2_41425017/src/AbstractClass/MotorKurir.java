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

class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }
 
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor [" + noPolisi + "] membawa '" + namaBarang +
                "' di box belakang menembus jalan sempit.");
    }
}
