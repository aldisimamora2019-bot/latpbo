/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianH;

/**
 *
 * @author LENOVO
 */
// 1. Default constructor: constructor tanpa parameter
public class DefaultConstructorDemo {

    static class Geeks {
        // Explicit default constructor (kalau tidak ditulis, compiler membuatnya otomatis)
        Geeks() {
            System.out.println("Default constructor");
        }
    }

    public static void main(String[] args) {
        Geeks hello = new Geeks(); // constructor dipanggil otomatis
    }
}

