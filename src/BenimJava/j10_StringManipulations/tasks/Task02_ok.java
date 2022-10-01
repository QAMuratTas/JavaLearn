package BenimJava.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02_ok {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden code create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */

Scanner sc = new Scanner(System.in);
        System.out.println("Pasword giriş yapınız: ");
        String password = sc.nextLine();

        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z')// ilk harfi büyük olsun
                &&(password.charAt(password.length()-1)>='0'&&// son karakteri sayı olsun
                password.charAt(password.length()-1)<='9')// son karakteri sayı olsun
                &&(password.length()>=6)) // en az 6 karakter olsun...
        {
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");






    }
}
