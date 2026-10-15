/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianE;

/**
 *
 * @author LENOVO
 */
public class AnonymousDemo {

    // Class kecil untuk contoh
    static class Greeter {
        void sayHello() {
            System.out.println("Hello from anonymous object!");
        }
    }

    public static void main(String[] args) {
        // 1) Anonymous object: langsung memanggil method tanpa variabel referensi
        new Greeter().sayHello();

        // 2) Anonymous inner class: implementasi Runnable tanpa memberi nama class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class running");
            }
        };
        r.run();

        // 3) Lambda: bentuk singkat dari objek anonymous (seperti pada setOnAction JavaFX)
        Runnable lambda = () -> System.out.println("Button clicked! (lambda)");
        lambda.run();
    }
}

