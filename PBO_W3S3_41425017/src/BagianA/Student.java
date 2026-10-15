/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author LENOVO
 */
public class Student {
    int id;      // atribut: nomor id mahasiswa
    String n;    // atribut: nama mahasiswa

    // Constructor: dipanggil otomatis saat objek dibuat dengan 'new'
    public Student(int id, String n) {
        this.id = id;   // 'this.id' = atribut milik objek, 'id' = parameter
        this.n = n;
    }
}
