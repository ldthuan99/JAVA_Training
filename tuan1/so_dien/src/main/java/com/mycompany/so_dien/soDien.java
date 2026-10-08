package com.mycompany.so_dien;

import java.util.Scanner;

public class soDien {  
    /**
    * TÍNH TIỀN ĐIỆN
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDien;
        int tien;
        System.out.println("Nhap so dien can tinh: ");
        soDien = sc.nextInt();
        if (soDien <= 50) tien = soDien*1800;
        else if(soDien <= 100) tien = 50*1800 + (soDien-50)*2000;
        else if(soDien <= 200) tien = 50*1800 + 50*2000 + (soDien-100)*2500;
        else tien = 50*1800 + 50*2000 + 100*2500 + (soDien-200)*3000;
        
        System.out.printf("So tien can tra cho %d kWh la: %d VND" , soDien,tien);        
    }
}
