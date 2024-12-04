

package com.mycompany.ukl_p3;

public class UKL_P3 {

    public static void main(String[] args) {
        int angka[] = {3, 7, 7, 1, 7, 7, 5}; 
        Sering(angka);
    }
    public static void Sering(int angka []) {
        int angkaS = angka[0];  // elemen paling sering
        int angkaM = 0;  // jumlah kemunculan elemen  
        // Loop untuk mengecek setiap elemen di array
        for (int i = 0; i < angka.length; i++) {
            int element = 0;
            for (int j = 0; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    element++;
                } //Menghitung berapa kali elemen angka[i] muncul 
            //dalam array dan membandingkannya dengan setiap elemen angka[j].
            }

            // Perbarui elemen paling sering jika ditemukan jumlah yang lebih besar
            if (element > angkaM) {
                angkaS = angka[i];
                angkaM = element;
            }
        }
        System.out.println("Elemen yang paling sering muncul adalah " + angkaS + " sebanyak " + angkaM + " kali.");
}
}
    
    

