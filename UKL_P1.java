package com.mycompany.ukl_p1;

import java.util.Scanner;

public class UKL_P1 {

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = masukkan.nextInt();    
        // Cek apakah bilangan prima
        boolean prima = true; 
        if (bilangan < 2) { 
            prima = false;
        } else {
            for (int i = 2; i <= bilangan / 2; i++) {
                if (bilangan % i == 0) { 
                    prima = false; 
                    break; 
                }
            }
        }
     
        if (prima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukanlah bilangan prima.");
        }
    
    }
}
    
