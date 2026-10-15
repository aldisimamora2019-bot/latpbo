/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianH;

/**
 *
 * @author LENOVO
 */
// 2. Parameterized constructor: constructor dengan parameter
public class ParameterizedConstructorDemo {

    static class Geeks {
        String name;
        int id;

        Geeks(String name, int id) {
            this.name = name; // isi atribut dengan nilai dari parameter
            this.id = id;
        }
    }

    public static void main(String[] args) {
        // Memanggil parameterized constructor
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);
    }
}

