/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianF;

/**
 *
 * @author LENOVO
 */
// Method clone(): membuat objek baru yang merupakan salinan objek saat ini
public class CloneObjectDemo {

    static class Book implements Cloneable {
        private String t; // judul buku

        public Book(String t) {
            this.t = t;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone(); // salin objek (shallow copy)
        }

        public String getTitle() {
            return t;
        }
    }

    public static void main(String[] args) {
        try {
            Book b1 = new Book("Java Basics");
            Book b2 = (Book) b1.clone(); // b2 = salinan b1

            System.out.println("Judul buku b1: " + b1.getTitle());
            System.out.println("Judul buku b2: " + b2.getTitle());
            // == membandingkan alamat memori: b1 dan b2 objek yang berbeda
            System.out.println("Apakah b1 dan b2 objek yang sama? " + (b1 == b2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

