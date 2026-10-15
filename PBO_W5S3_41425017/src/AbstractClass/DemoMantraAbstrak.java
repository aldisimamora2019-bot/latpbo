/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

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

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();
    }
}

/*
1.Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? 
Coba dan jelaskan errornya. 
=>Terjadi compile error: MantraAbstrak is abstract; cannot be instantiated. 
Abstract class punya method yang belum ada isinya (efek()), jadi objeknya tidak 
boleh dibuat dengan new. Solusinya, buat objek dari subclass konkret, misalnya new Expelliarmus().

2.Mengapa kita perlu membuat abstract class? Apa keuntungannya?
=>Abstract class dipakai untuk konsep umum yang belum lengkap. Keuntungannya:
a.Subclass wajib mengimplementasikan efek().
b.Kode umum (nama, ucapkan()) cukup ditulis sekali.
c.Mendukung polymorphism, karena satu tipe MantraAbstrak bisa menampung berbagai mantra.
d.Mantra baru mudah ditambah tanpa mengubah kode lama.
*/
