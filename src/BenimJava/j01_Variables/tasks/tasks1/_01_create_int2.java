package BenimJava.j01_Variables.tasks.tasks1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class _01_create_int2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("gün sayısını gir: ");
        int gun = sc.nextInt();
        switch (gun) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            default:
                System.out.println("yanlış gün");
        }
    }
}
      /*    Değeri 100 olan bir int oluştur.
            Ve bu int 'i yazdır.      */


        //Kodu aşağıya yazınız.

        //int a = 100;
        //System.out.println(a);




