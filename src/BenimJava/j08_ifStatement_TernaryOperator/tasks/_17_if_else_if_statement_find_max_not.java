package BenimJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max_not {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);


        System.out.println("İlk sayıyı giriniz : ");
        int i1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int i2 = scan.nextInt();
        System.out.println("3. sayıyı giriniz : ");
        int i3 = scan.nextInt();


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


        if (i1 > i2 && i1 > i3) {
            System.out.println("Girilen sayılanların en büyüğü : " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Girilen sayılanların en büyüğü : " + i2);
        } else if (i3 > i1 && i3 > i2) {
            System.out.println("Girilen sayılanların en büyüğü : " + i3);
        } else if (i1 == i2 || i2 == i3 || i3 == i1) {
            System.out.println("Girdiklerinizden eşit olanlar var.: ");
        }
    }}
