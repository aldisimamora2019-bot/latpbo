/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianE;

/**
 *
 * @author LENOVO
 */
// Satu variabel referensi parent class bisa menyimpan objek subclass yang berbeda
public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog(); // menggunakan Dog object
        obj.sound();

        obj = new Cat();        // variabel yang sama sekarang menyimpan Cat object
        obj.sound();
    }
}
