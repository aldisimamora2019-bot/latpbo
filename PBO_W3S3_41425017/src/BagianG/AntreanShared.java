/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianG;

/**
 *
 * @author LENOVO
 */
// Resource bersama antara thread produsen dan konsumen (wait/notify)
public class AntreanShared {
    private String data;               // pesan yang disimpan
    private boolean adaData = false;   // penanda: true jika ada pesan yang belum diambil

    // Dipanggil produsen untuk mengirim pesan
    public synchronized void kirimPesan(String pesan) {
        while (adaData) {              // jika pesan lama belum diambil, tunggu
            try {
                wait();                // lepas lock & menunggu notify
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan;
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);
        notify();                      // beri tahu konsumen bahwa data sudah siap
    }

    // Dipanggil konsumen untuk mengambil pesan
    public synchronized String ambilPesan() {
        while (!adaData) {             // jika belum ada pesan, tunggu
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;
        System.out.println("Pesan diterima: " + data);
        notify();                      // beri tahu produsen bahwa tempat sudah kosong
        return data;
    }
}
