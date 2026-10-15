/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

/**
 *
 * @author LENOVO
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {
    public static void main(String[] args) 
    {
        // Serialization: menulis objek Student ke file student.ser
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: membaca kembali objek dari file student.ser
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject(); // casting ke Student
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}