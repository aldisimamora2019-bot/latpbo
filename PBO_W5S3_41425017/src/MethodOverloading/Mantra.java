/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author LENOVO
 */

 /*
Nama: Aldi Tulus Rio Simamora
NIM: 41425017
Prodi : D4 TRPL
*/

import java.util.*;

public class Mantra {

    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload 3: tiga parameter (nama mantra, kekuatan, target)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }
    
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        
        System.out.println("Efek: " + target + " terkena mantra " + namaMantra + " dengan kekuatan standar.");
    }

    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("[Urutan terbalik] Kekuatan " + kekuatan + " untuk mantra " + namaMantra);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra(); // buat objek Mantra

        mantra.ucapkan("Expelliarmus");                  
        mantra.ucapkan("Expelliarmus", 5);              
        mantra.ucapkan("Expelliarmus", 15, "Voldemort"); 

        // Pengujian overload tambahan
        mantra.ucapkan("Expelliarmus", "Draco");        
        mantra.ucapkan(12, "Expelliarmus");             
    }
}

/*
1.Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method 
dengan dua parameter.
=>Jika method dua parameter ucapkan(String, int) dihapus, pemanggilan
  mantra.ucapkan("Expelliarmus", 5); di main() akan COMPILE ERROR
  ("no suitable method found for ucapkan(String,int)"), karena tidak ada
   method lain yang cocok dengan tipe argumen tersebut.

2.Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba 
buat method ucapkan(int kekuatan, String namaMantra).
=>Bisa, asalkan signature-nya (urutan/tipe parameter) berbeda. Yang
  dibedakan adalah TIPE dan URUTAN parameter, BUKAN nama parameter dan
  BUKAN return type.
*/