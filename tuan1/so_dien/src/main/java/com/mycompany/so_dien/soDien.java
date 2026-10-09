package com.mycompany.so_dien;

import java.util.ArrayList;
import java.util.Scanner;

public class SoDien {

    static Scanner sc = new Scanner(System.in);

    /**
     * Calculates bill money for electricity used
     *
     * @param soDien1 number of electricity used
     *
     * @param tien1 money of electricity bill
     */
    public static void tinhTien(ArrayList<Integer> soDien1, ArrayList<Integer> tien1) {
        int tien, soDien;
        System.out.println("Nhap so dien can tinh: ");
        soDien = sc.nextInt();
        if (soDien <= 50) {
            tien = soDien * 1800;
        } else if (soDien <= 100) {
            tien = 50 * 1800 + (soDien - 50) * 2000;
        } else if (soDien <= 200) {
            tien = 50 * 1800 + 50 * 2000 + (soDien - 100) * 2500;
        } else {
            tien = 50 * 1800 + 50 * 2000 + 100 * 2500 + (soDien - 200) * 3000;
        }
        System.out.println("So tien can tra la: " + tien + " VND");
        soDien1.add(soDien);
        tien1.add(tien);
    }

    /**
     * Display all electtricity bill
     *
     * @param soDien1 number of electricity used
     *
     * @param tien1 money of electricity bill
     */
    public static void inDanhSach(ArrayList<Integer> soDien1, ArrayList<Integer> tien1) {
        System.out.println("\n=============Danh Sach==============");
        System.out.println(" STT |   so dien(kWh)  |  thanh tien(VND)   ");
        for (int i = 0; i < soDien1.size(); i++) {
            System.out.printf("  %d  |       %d        |       %d\n", i + 1, soDien1.get(i), tien1.get(i));
        }
    }

    /**
     * delete 1 bill you choise
     *
     * @param soDien1 number of electricity used
     *
     * @param tien1 money of electricity bill
     */
    public static void xoa(ArrayList<Integer> soDien1, ArrayList<Integer> tien1) {
        System.out.println("Nhap vi tri muon xoa");
        int i = sc.nextInt();
        if (i > soDien1.size()) {
            System.out.println("STT khong hop le");
        } else {
            soDien1.remove(i - 1);
            tien1.remove(i - 1);
            System.out.println("Xoa thanh cong!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> soDien1 = new ArrayList<>();
        ArrayList<Integer> tien1 = new ArrayList<>();

        int chon;
        do {

            System.out.println("\n=============MENU==============");
            System.out.println("|   1. Tinh tien dien:         |");
            System.out.println("|   2. Xem danh sach:          |");
            System.out.println("|   3. Xoa:                    |");
            System.out.println("|   0. Thoat chuong trinh!     |");
            System.out.println("===============================\n");
            System.out.println("Nhap lua chon cua ban: ");

            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    tinhTien(soDien1, tien1);
                    System.out.println();
                    break;
                case 2:
                    inDanhSach(soDien1, tien1);
                    System.out.println();
                    break;
                case 3:
                    xoa(soDien1, tien1);
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
