/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianJ;

/**
 *
 * @author LENOVO
 */
// Contoh 2: setter dengan validasi nilai
public class GetSetNumber {
    private int num;

    // Setter: hanya menerima angka 1 sampai 10
    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(); // tolak nilai di luar rentang
        }
        num = number;
    }

    // Getter
    public int getNumber() {
        return num;
    }
}
