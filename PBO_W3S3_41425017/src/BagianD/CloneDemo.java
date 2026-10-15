/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

/**
 *
 * @author LENOVO
 */



public class CloneDemo implements Cloneable {
    String name = "GeeksForGeeks";

    // Override clone(): memanggil clone() milik class Object (super = parent class)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        CloneDemo o1 = new CloneDemo();
        try {
            CloneDemo o2 = (CloneDemo) o1.clone(); // o2 = salinan o1
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

