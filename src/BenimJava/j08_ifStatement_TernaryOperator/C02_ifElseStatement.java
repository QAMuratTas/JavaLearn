package BenimJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
/*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("yaşı giriniz:");
        int yas = sc.nextInt();
        if (yas > 18) System.out.println("yaşiniz 18 den büyük");
        else System.out.println("ehliyet alamzsınız");


    }
}

