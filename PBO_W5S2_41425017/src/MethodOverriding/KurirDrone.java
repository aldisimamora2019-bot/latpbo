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

class KurirDrone extends KurirReguler {
    private String idDrone; // ID unit drone
 
    public KurirDrone(String nama, String idDrone) {
        super(nama); // memanggil constructor parent
        this.idDrone = idDrone;
    }
 
    //perilaku kirimBarang diganti menjadi lewat udara
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}
