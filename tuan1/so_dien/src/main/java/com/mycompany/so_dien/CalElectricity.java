package com.mycompany.so_dien;

import java.util.ArrayList;
import java.util.Scanner;

public class CalElectricity {


    static Scanner sc = new Scanner(System.in);

    /**
     * Calculates bill money for electricity used
     *
     * @param electricity_number1 number of electricity used
     * @param amount1 money of electricity bill
     */
    public static int calculate_money(ArrayList<Integer> electricity_number1, ArrayList<Integer> amount1) {
        int amount, electricity_number;
        System.out.println("Input electricity number: ");
        electricity_number = sc.nextInt();        
        int electric_price_1 = 1800;
        int electric_price_2 = 2000;
        int electric_price_3 = 2500;
        int electric_price_4 = 3000;

        if (electricity_number <= 50) {
            amount = electricity_number * electric_price_1;
        } else if (electricity_number <= 100) {
            amount = 50 * electric_price_1 + (electricity_number - 50) * electric_price_2;
        } else if (electricity_number <= 200) {
            amount = 50 * electric_price_1 + 50 * electric_price_2 + (electricity_number - 100) * electric_price_3;
        } else {
            amount = 50 * electric_price_1 + 50 * electric_price_2 + 100 * electric_price_3 + (electricity_number - 200) * electric_price_4;
        }
        System.out.println("Amount to pay: " + amount + " VND");
        amount1.add(amount);
        electricity_number1.add(electricity_number);
        return amount;
    }

    /**
     * Display all electtricity bill
     *
     * @param electricity_number1 number of electricity used
     * @param amount1 money of electricity bill
     */
    public static void display(ArrayList<Integer> electricity_number1, ArrayList<Integer> amount1) {
        System.out.println("\n=============List==============");
        System.out.println(" Number |   Electricity used (kWh)  |  Total amount (VND)   ");
        for (int i = 0; i < amount1.size(); i++) {
            System.out.printf("    %d   |             %d            |       %d\n", i + 1, electricity_number1.get(i), amount1.get(i));
        }
    }

    /**
     * delete 1 bill you choise
     *
     * @param electricity_number1 number of electricity used
     * @param amount1 money of electricity bill
     */
    public static void delete(ArrayList<Integer> electricity_number1, ArrayList<Integer> amount1) {
        System.out.println("Enter position to delete:");
        int index = sc.nextInt();
        if (index > amount1.size()) {
            System.out.println("Invalid number");
        } else {
            amount1.remove(index - 1);
            electricity_number1.remove(index - 1);
            System.out.println("Deleted successfully!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> amount1 = new ArrayList<>();
        ArrayList<Integer> electricity_number1 = new ArrayList<>();

        int chon;
        do {
            System.out.println("\n==============MENU===============");
            System.out.println("|   1. Calculate electricity bill |");
            System.out.println("|   2. View list                  |");
            System.out.println("|   3. Delete:                    |");
            System.out.println("|   0. Exit program!              |");
            System.out.println("==================================\n");
            System.out.println("Enter your choice: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    calculate_money(electricity_number1, amount1);
                    System.out.println();
                    break;
                case 2:
                    display(electricity_number1, amount1);
                    System.out.println();
                    break;
                case 3:
                    delete(electricity_number1, amount1);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Program exited successfully! ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice!\n");
                    System.out.println();
            }
        } while (chon != 0);
    }
}
