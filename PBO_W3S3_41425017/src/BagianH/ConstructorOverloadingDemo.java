/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianH;

/**
 *
 * @author LENOVO
 */
// Constructor overloading: banyak constructor dengan daftar parameter berbeda
public class ConstructorOverloadingDemo {

    static class Geeks {
        // Constructor dengan 1 parameter String
        Geeks(String name) {
            System.out.println("Constructor with one argument - String: " + name);
        }

        // Constructor dengan 2 parameter (String dan int)
        Geeks(String name, int age) {
            System.out.println("Constructor with two arguments: "
                    + " String and Integer: " + name + " " + age);
        }

        // Constructor dengan 1 parameter, tetapi tipenya long
        Geeks(long id) {
            System.out.println("Constructor with one argument: " + "Long: " + id);
        }
    }

    public static void main(String[] args) {
        // Java memilih constructor berdasarkan jumlah & tipe argumen
        Geeks geek2 = new Geeks("Sweta");
        Geeks geek3 = new Geeks("Amiya", 28);
        Geeks geek4 = new Geeks(325614567L);
    }
}

