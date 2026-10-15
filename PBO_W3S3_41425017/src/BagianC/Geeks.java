/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

/**
 *
 * @author LENOVO
 */
public class Geeks {
    static String name;  // atribut static (milik class)
    static float price;

    // Method setter: mengatur nilai atribut
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method getter: menampilkan nilai atribut
    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args) {
        Geeks.set("Visual studio", 0.0f); // isi nilai lewat method
        Geeks.get();                      // tampilkan nilai
    }
}
