/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author LENOVO
 */

/*
Nama  : Aldi Tulus Rio Simamora
NIM   : 41425017
Tugas : Pemrograman Berbasis Objek
 */

public class CorporateDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
