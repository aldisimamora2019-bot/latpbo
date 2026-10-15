/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method hashCode(): menghasilkan angka integer untuk objek (dipakai HashSet/HashMap)
public class HashCodeDemo {

    static class Student {
        int roll;

        // Override hashCode agar berdasarkan nilai roll
        @Override
        public int hashCode() {
            return roll;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;

        Student s2 = new Student();
        s2.roll = 102;

        System.out.println("HashCode s1: " + s1.hashCode()); // 101
        System.out.println("HashCode s2: " + s2.hashCode()); // 102
    }
}
