/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemPertahananHogwarts;

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

// Abstract class induk semua mantra perlindungan
abstract class MantraPerlindungan {
    private String nama;
    private boolean aktif; // status mantra (aktif / tidak)

    public MantraPerlindungan(String nama) {
        this.nama = nama;
        this.aktif = false;
    }

    public String getNama() { return nama; }
    public boolean isAktif() { return aktif; }
    protected void setAktif(boolean aktif) { this.aktif = aktif; }

    // Abstract method: tiap mantra punya cara aktivasi & deaktivasi sendiri
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// Protego: perisai pelindung
class Protego extends MantraPerlindungan {
    public Protego() { super("Protego"); }

    @Override
    public void aktifkan() {
        setAktif(true);
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Perisai Protego menghilang.");
    }
}

// Fidelius: butuh seorang penyihir sebagai Secret Keeper
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;  // nama penyihir penjaga rahasia
    private String rahasia;       // rahasia yang dilindungi

    public Fidelius(String secretKeeper, String rahasia) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
        this.rahasia = rahasia;
    }

    @Override
    public void aktifkan() {
        // Tanpa secret keeper, mantra tidak dapat diaktifkan
        if (secretKeeper == null || secretKeeper.isEmpty()) {
            System.out.println("Fidelius gagal: butuh Secret Keeper!");
            return;
        }
        setAktif(true);
        System.out.println("Fidelius aktif! " + secretKeeper
                + " menjadi Secret Keeper dari rahasia: \"" + rahasia + "\"");
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Fidelius dinonaktifkan. Rahasia \"" + rahasia + "\" tidak lagi tersembunyi.");
    }
}

// Anti-Apparition: mencegah apparate di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        setAktif(true);
        System.out.println("Anti-Apparition aktif di area " + area + ": tidak ada yang bisa ber-apparate!");
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Anti-Apparition di area " + area + " dinonaktifkan.");
    }
}

// Sistem pertahanan: menampung banyak mantra via tipe abstrak (polymorphism)
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.getNama() + " ditambahkan ke sistem pertahanan.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n=== Mengaktifkan semua mantra ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.aktifkan(); // method yang jalan sesuai tipe asli objek
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== Menonaktifkan semua mantra ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.nonaktifkan();
        }
    }
}

public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Buat beberapa objek mantra dan tambahkan ke sistem pertahanan
        hogwarts.tambahMantra(new Protego());
        hogwarts.tambahMantra(new Fidelius("Albus Dumbledore", "Lokasi Ruang Kebutuhan"));
        hogwarts.tambahMantra(new MantraAntiApparition("Seluruh Kastil Hogwarts"));

        hogwarts.aktifkanSemuaMantra();
        hogwarts.nonaktifkanSemuaMantra();
    }
}