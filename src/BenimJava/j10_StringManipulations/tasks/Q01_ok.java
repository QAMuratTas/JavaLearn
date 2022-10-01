package BenimJava.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01_ok {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String str = sc.nextLine();
        System.out.println((str.contains(" ") ? "Girdiğiniz cümle boşluk içeriyor:)" :"Girdiğiniz cümle boşluk içermiyor :(") );

    }
}
