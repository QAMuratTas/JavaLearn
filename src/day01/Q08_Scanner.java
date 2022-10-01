package day01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");

        int sayı1= input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int sayı2 = input.nextInt();
        int sum = sayı1 + sayı2;
        System.out.println("iki sayının toplamı:"+sum );


    }
}
