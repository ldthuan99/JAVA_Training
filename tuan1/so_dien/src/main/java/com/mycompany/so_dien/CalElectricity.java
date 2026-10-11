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

        do {
            try {
                System.out.println("Nhap so dien can tinh: ");
                electricity_number = sc.nextInt();
                if (electricity_number <= 0) {
                    System.out.println("So dien phai lon hon 0");
                }
            } catch (Exception e) {
                System.out.println("So dien khong hop le");
                sc.nextLine();
                electricity_number = -1;

            }
        } while (electricity_number <= 0);

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
        System.out.println("So tien can tra la: " + amount + " VND");
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
        if (amount1.isEmpty()) {
            System.out.println("Danh sach chua co hoa don!");
            return;
        }
        System.out.println("\n=============Danh Sach==============");
        System.out.println(" STT |   so dien(kWh)  |  thanh tien(VND)   ");
        for (int i = 0; i < amount1.size(); i++) {
            System.out.printf("  %d  |       %d        |       %d\n", i + 1, electricity_number1.get(i), amount1.get(i));
        }
    }

    /**
     * delete 1 bill you choise
     *
     * @param electricity_number1 number of electricity used
     * @param amount1 money of electricity bill
     */
    public static void delete(ArrayList<Integer> electricity_number1, ArrayList<Integer> amount1) {
        if (amount1.isEmpty()) {
            System.out.println("Khong co hoa don de xoa!");
            return;
        }
        int i = 0;
        do {
            System.out.println("Nhap vi tri muon xoa");
            try {
                i = sc.nextInt();
                if (i < 1 || i > amount1.size()) {
                    System.out.println("STT khong hop le!");
                }
            } catch (Exception e) {
                System.out.println("Du lieu khong hop le!");
                sc.nextLine();
                i = -1;
            }
        } while (i < 1 || i > amount1.size());

        amount1.remove(i - 1);
        electricity_number1.remove(i - 1);
        System.out.println("Xoa thanh cong!");
    }

    public static void main(String[] args) {
        ArrayList<Integer> amount1 = new ArrayList<>();
        ArrayList<Integer> electricity_number1 = new ArrayList<>();

        int chon;
        do {

            System.out.println("\n=============MENU==============");
            System.out.println("|   1. Tinh tien dien:         |");
            System.out.println("|   2. Xem danh sach:          |");
            System.out.println("|   3. Xoa:                    |");
            System.out.println("|   0. Thoat chuong trinh!     |");
            System.out.println("===============================\n");
            System.out.println("Nhap lua chon cua ban: ");

            try {
                chon = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Du lieu khong hop le!");
                sc.nextLine();
                chon = -1;
                continue;
            }

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
                    System.out.println("Thoat chuong trinh thanh cong! ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Lua chon khong hop le!\n");
                    System.out.println();

            }

        } while (chon != 0);

    }
}
