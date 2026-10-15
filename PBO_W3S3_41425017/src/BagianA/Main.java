/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek s1 dari class Student (instansiasi) lewat operator new
        Student s1 = new Student(10, "Alice");

        // Mengakses atribut objek
        System.out.println(s1.id); // output: 10
        System.out.println(s1.n);  // output: Alice
    }
    
}
