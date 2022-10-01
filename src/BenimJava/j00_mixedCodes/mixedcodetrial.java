package BenimJava.j00_mixedCodes;

import java.util.Scanner;

public class mixedcodetrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İşlem seçiniz : ");
        String secim = input.next();
        System.out.println("İlk sayıyı giriniz : ");
        int sayı1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int sayı2 = input.nextInt();

        if (secim.equals("+") ) {
            System.out.println("Toplam = " + (sayı1 + sayı2));
        }
        if (secim.equals("-")) {
            System.out.println("Çıkarma = "+ (sayı1 - sayı2));
        }
        if (secim.equals("*")) {
            System.out.println("Çarpım : " + (sayı1 * sayı2));
        }
        if (secim.equals("/")) {
            System.out.println("Bölüm :" + (sayı1/sayı2));
        }
    }
}
