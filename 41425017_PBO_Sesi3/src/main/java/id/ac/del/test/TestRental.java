/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

import id.ac.del.rental.CorporateDiscount;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.VehicleRental;

/**
 *
 * @author LENOVO
 */

/*
Nama  : Aldi Tulus Rio Simamora
NIM   : 41425017
Tugas : Pemrograman Berbasis Objek
 */

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        // Data tidak valid sekarang ditolak oleh setter
        v.setPlateNumber("");     // ditolak: plat kosong
        v.setRentalDays(-7);      // ditolak: hari negatif

        // Data valid
        v.setRentalDays(7);

        // Tipe referensi adalah interface, objeknya bisa diganti-ganti (polimorfisme)
        Discountable member = new MemberDiscount();
        Discountable flash = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Tanpa diskon   : Rp" + v.getTotalCost(null));
        System.out.println("Member (10%)   : Rp" + v.getTotalCost(member));
        System.out.println("Flash Sale(25%): Rp" + v.getTotalCost(flash));
        System.out.println("Corporate (15%): Rp" + v.getTotalCost(corporate));
    }
}
