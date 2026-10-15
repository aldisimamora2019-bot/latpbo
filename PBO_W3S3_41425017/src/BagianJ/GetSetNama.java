/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianJ;

/**
 *
 * @author LENOVO
 */
// Contoh 1: getter dan setter dasar
public class GetSetNama {
    private String name; // private: tidak bisa diakses langsung dari luar class

    // Getter (accessor): mengambil nilai name
    public String getName() {
        return name;
    }

    // Setter (mutator): mengubah nilai name
    public void setName(String N) {
        this.name = N;
    }
}
