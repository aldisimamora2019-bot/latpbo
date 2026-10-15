/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian5;

/**
 *
 * @author LENOVO
 */
public class Student_hashCode {
    int roll;
 
    @Override
    public int hashCode() {
        return roll;
    }
 
    public static void main(String[] args) {
        Student_hashCode s1 = new Student_hashCode();
        s1.roll = 101;
 
        Student_hashCode s2 = new Student_hashCode();
        s2.roll = 102;
 
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
    
}
