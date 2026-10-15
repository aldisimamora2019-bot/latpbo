/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method finalize(): dipanggil Garbage Collector sebelum objek dihapus.
// CATATAN: finalize() sudah deprecated di Java baru, jadi warning itu normal
// dan pesan "finalize method called" tidak dijamin muncul.
public class FinalizeDemo {
    public static void main(String[] args) {
        FinalizeDemo t = new FinalizeDemo();
        System.out.println(t.hashCode());

        t = null;     // tidak ada lagi referensi ke objek -> layak dihapus GC
        System.gc();  // meminta JVM menjalankan Garbage Collector

        System.out.println("end");
    }

    @SuppressWarnings({"deprecation", "removal"})
    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}

