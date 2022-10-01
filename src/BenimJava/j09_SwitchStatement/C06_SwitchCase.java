package BenimJava.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
// task -> Girilen haftanın gününü hafta içi veya sonu oldugunu prınt eden code creat edınız...
    Scanner sc=new Scanner(System.in);
        System.out.println("Gün giriniz:") ;
        String gun=sc.nextLine().toLowerCase();
        switch(gun) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":// buraya kadr ortak oldugu ıcın böyle oldu...
                System.out.println(gun + " Hafta içi");

                break;
            case "cumartesi":
            case "pazar":
                System.out.println(gun + " Hafta sonu");
                break;
                default:
                    System.out.println("error verdiniz gun giriniz");
                    // switch hiç bir case eşleşmeze çalışır...

                }










    }
}
