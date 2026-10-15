/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianJ;

/**
 *
 * @author LENOVO
 */
public class MainGetSetNumber {
    public static void main(String[] args) {
        GetSetNumber obj = new GetSetNumber();
        obj.setNumber(5);                      // nilai valid
        System.out.println(obj.getNumber());   // 5

        // Uji nilai tidak valid: setter melempar exception
        try {
            obj.setNumber(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Nilai 20 ditolak (harus 1-10)");
        }
    }
}
