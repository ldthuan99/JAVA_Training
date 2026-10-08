

package com.mycompany.so_dien;

import java.util.Scanner;


public class So_dien {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int tien;
        System.out.println("Nhap so dien can tinh: ");
        a=sc.nextInt();
        if (a<=50) tien=a*1800;
        else if(a<=100) tien= 50*1800 + (a-50)*2000;
        else if(a<=200) tien= 50*1800 + 50*2000 + (a-100)*2500;
        else tien= 50*1800 + 50*2000 + 100*2500 + (a-200)*3000;
        
        System.out.printf("So tien can tra cho %d kWh la: %d VND" , a,tien);
        
    }
}
