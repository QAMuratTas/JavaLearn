package BenimJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı gir: ");
        int say = sc.nextInt();

        if (say > 0)
            System.out.println("sayınız pozitif");
        else if (say < 0)
            System.out.println("sayı negatif")
                    ;
        else
            System.out.println("sıfıra eşit ");
    }

}

    /*
          Task01
             girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
           */


