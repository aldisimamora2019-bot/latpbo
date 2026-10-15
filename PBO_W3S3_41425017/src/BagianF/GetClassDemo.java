/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method getClass(): mengembalikan class asli (runtime class) dari objek.
// Method ini final sehingga tidak bisa di-override.
public class GetClassDemo {
    public static void main(String[] args) {
        Object o = new String("GeeksForGeeks"); // tipe variabel Object, isinya String
        Class<?> c = o.getClass();
        System.out.println("Class of Object o is: " + c.getName()); // java.lang.String
    }
}