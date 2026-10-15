/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

/**
 *
 * @author LENOVO
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    // Constructor tanpa parameter (dibutuhkan oleh Reflection)
    public Student() {
        this.name = "Unknown";
    }

    // Constructor dengan parameter
    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}