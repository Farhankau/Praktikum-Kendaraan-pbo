/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Kau
 */
public class MainKendaraan {
    public static void main(String[] args) { 
        //  Mobil
        Mobil mobil1 = new Mobil("B 1234 ABC", "Toyota Avanza", 2019, 5, "Bensin");

        //  Motor
        Motor motor1 = new Motor("D 5678 XYZ", "Honda Beat", 2021, true);

        // Informasi kendaraan
        System.out.println(" Data Mobil ");
        mobil1.tampilkanInfo();

        System.out.println(); 

        System.out.println(" Data Motor ");
        motor1.tampilkanInfo();
    }
}

