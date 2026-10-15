/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverriding;

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

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();

        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
    }
}

/*
1.Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih 
berjalan?
=>Ya, kode tetap berjalan dan overriding tetap terjadi, selama nama method, parameter, 
dan return type sama persis dengan method di superclass. @Override bukan syarat agar 
overriding bekerja. Ia hanya penanda yang membuat compiler memeriksa kodenya.

2.Apa keuntungan menggunakan polymorphism dalam contoh ini?
=>Variabel bertipe Penyihir bisa menunjuk objek HarryPotter, Hermione, atau RonWeasley. 
Java memilih method yang dijalankan berdasarkan objek aslinya saat runtime.
*/
