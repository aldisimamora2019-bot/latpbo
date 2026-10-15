/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method equals(): membandingkan isi (kesetaraan) dua objek
public class EqualsDemo {

    static class Student {
        int roll;

        // Override equals: dua Student dianggap sama jika roll-nya sama
        @Override
        public boolean equals(Object o) {
            if (o instanceof Student) {                 // pastikan tipenya Student
                return this.roll == ((Student) o).roll; // bandingkan nilai roll
            }
            return false;
        }

        // Praktik baik: override hashCode bersama equals
        @Override
        public int hashCode() {
            return roll;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;
        Student s2 = new Student();
        s2.roll = 101;
        Student s3 = new Student();
        s3.roll = 102;

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false
    }
}

