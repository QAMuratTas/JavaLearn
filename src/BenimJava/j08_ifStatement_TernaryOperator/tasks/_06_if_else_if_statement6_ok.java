package BenimJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6_ok {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

    if (number == 0)
            System.out.println("Im neutral");else if (number>0) System.out.println("I m positive");
            else if (number<0) System.out.println("I am negative");



    }
}
// run : number = 0  Im neutral
// run : number =-1 I am negative
// run : number = 9 I am positive