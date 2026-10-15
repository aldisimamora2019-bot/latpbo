/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianG;

/**
 *
 * @author LENOVO
 */
// Menjalankan thread produsen dan konsumen
public class MainConcurrency {
    public static void main(String[] args) {
        AntreanShared antrean = new AntreanShared();

        // Thread Produsen: mengirim 3 pesan
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Thread Konsumen: mengambil 3 pesan
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        produsen.start();  // jalankan kedua thread
        konsumen.start();
    }
}

