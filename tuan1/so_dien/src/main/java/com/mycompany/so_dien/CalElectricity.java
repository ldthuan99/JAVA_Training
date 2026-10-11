package com.mycompany.so_dien;

import java.util.Scanner;

public class CalElectricity {

    /**
     * Calculate the amount of electricity used
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int electricity_number;
        int amount;
        System.out.println("Nhap so dien can tinh: ");
        electricity_number = sc.nextInt();
        if (electricity_number <= 50) {
            amount = electricity_number * 1800;
        } else if (electricity_number <= 100) {
            amount = 50 * 1800 + (electricity_number - 50) * 2000;
        } else if (electricity_number <= 200) {
            amount = 50 * 1800 + 50 * 2000 + (electricity_number - 100) * 2500;
        } else {
            amount = 50 * 1800 + 50 * 2000 + 100 * 2500 + (electricity_number - 200) * 3000;
        }

        System.out.printf("So tien can tra cho %d kWh la: %d VND", electricity_number, amount);
    }
}
