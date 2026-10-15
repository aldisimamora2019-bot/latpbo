/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

/**
 *
 * @author LENOVO
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Mencari class berdasarkan nama lengkap (package + nama class)
            Class<?> c = Class.forName("t04_cara_membuat_objek.Student");
            // Mengambil constructor tanpa parameter lalu membuat instance-nya
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
