

package com.mycompany.ukl_p2;
import java.util.Scanner;
import java.util.Random;
public class UKL_P2 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Random random = new Random();
        char [] operators = {'*', '/', '%'};
        boolean terusKuis = true;

        while (terusKuis) {
            int bilanganPertama = random.nextInt(10) + 1; // Bilangan acak antara 1 hingga 10
            int bilanganKedua = random.nextInt(10) + 1;
            char operator = operators[random.nextInt(operators.length)];

            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ");
            int jawabanPengguna = masuk.nextInt();
            int jawabanBenar = 0;

            switch (operator) {
                case '*':
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case '/':
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case '%':
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
            }

            if (jawabanPengguna == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String lanjut = masuk.next();
            if (lanjut.equalsIgnoreCase("tidak")) {
                terusKuis = false;
            }
        }

        System.out.println("OK OK terima kasih telah bermain!");
        masuk.close();
    }
}

        
        
//        Scanner input = new Scanner(System.in);
//        Random masuk = new Random();
//        boolean lanjut = true;
//
//        while (lanjut) {
//            int bilangan1 = masuk.nextInt(10)+1  ; 
//            int bilangan2 = masuk.nextInt(10)+1 ;
//            char operators[] = {'*', '/', '%'};
//            char operator = operators[masuk.nextInt(operators.length)];
//            System.out.println(bilangan1 + " " + operator + " " + bilangan2 + " = ");
//            int jawabanUser = masuk.nextInt();
//            int jawabanBenar = 0;
//            switch (operator) {
//                case '*':
//                    jawabanBenar = bilangan1 * bilangan2;
//                    break;
//                case '/':
//                    jawabanBenar = bilangan1 / bilangan2;
//                    break;
//                case '%':
//                    jawabanBenar = bilangan1 % bilangan2;
//                    break;
//            }
//            if (jawabanUser == jawabanBenar) {
//                System.out.println("Jawaban Anda benar!");
//            } else {
//                System.out.println("Jawaban salah. Jawaban yang benar adalah : " + jawabanBenar );
//            }
//            System.out.print("Ingin melanjutkan kuis? (ya/tidak): ");
//            String respon = input.next();
//            if (respon.equalsIgnoreCase("tidak")) {
//                lanjut = false;}
//        }
//        System.out.println("Terima kasih telah mengikuti kuis kami!");
   

