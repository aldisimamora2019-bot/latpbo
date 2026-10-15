/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianI;

/**
 *
 * @author LENOVO
 */
// Class yang menerima objek lain sebagai parameter method
public class ObjectPassDemo {
    int a, b;

    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method menerima objek ObjectPassDemo lain, lalu membandingkan isinya
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}
