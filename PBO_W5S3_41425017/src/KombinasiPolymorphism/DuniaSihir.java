/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolymorphism;

/**
 *
 * @author LENOVO
 */

/*
Nama: Aldi Tulus Rio Simamora
NIM: 41425017
Prodi : D4 TRPL
*/

import java.util.ArrayList;
import java.util.List;

// Abstract class Mantra: kontrak untuk semua mantra
abstract class Mantra {
    private String nama; // nama mantra (private = encapsulation)

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method: efek diimplementasikan oleh tiap subclass
    public abstract void efek();
}

// Mantra konkret 1
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus"); // kirim nama ke constructor Mantra
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Mantra konkret 2
class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Mantra konkret 3
class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Penyihir hanya bergantung pada tipe abstrak Mantra (bukan mantra konkret)
class Penyihir {
    private String nama;
    private List<Mantra> mantraList; // daftar mantra yang sudah dipelajari

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Belajar mantra: menerima mantra apa pun (polymorphism)
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Mengucapkan satu mantra berdasarkan nama
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek(); // efek sesuai jenis mantra aslinya (dynamic binding)
                return;
            }
        }
        // Jika tidak ditemukan di daftar
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // [TUGAS] Mengucapkan semua mantra yang sudah dipelajari dalam satu perintah
    public void ucapkanSemuaMantra() {
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        System.out.println("--- " + nama + " mengucapkan semua mantranya ---");
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        // Harry belajar dua mantra
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        // Mengucapkan mantra satu per satu
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Mengucapkan semua mantra sekaligus
        harry.ucapkanSemuaMantra();
    }
}
