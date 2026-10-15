/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method toString(): mengubah objek menjadi String
public class ToStringDemo {

    static class Student {
        // Tanpa override, hasilnya berupa NamaClass@hashcode
        @Override
        public String toString() {
            return "Student object";
        }
    }

    // Class tanpa override toString()
    static class Plain { }

    public static void main(String[] args) {
        Student s = new Student();          // membuat objek Student
        System.out.println(s.toString());   // memanggil toString() hasil override
        System.out.println(new Plain());    // toString() bawaan: nama class@hash (hex)
    }
}
