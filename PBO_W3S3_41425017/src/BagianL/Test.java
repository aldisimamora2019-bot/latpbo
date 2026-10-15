/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianL;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("----");
        Bus bus = new Bus();     // Vehicle -> Fare -> Bus
        bus.passengerInfo();     // method dari interface Passenger
    }
}