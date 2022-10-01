package BenimJava.j10_StringManipulations.tasks;

        import java.util.Scanner;

public class Q07_ok {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
    Scanner sc = new Scanner(System.in);
        System.out.println("Üç harfli bir isim giriniz Lütfen :");
        String str = sc.next();

        char birincikr = str.charAt(0);
        char ikincikr = str.charAt(1);
        char ücüncü = str.charAt(2);
        if (str.length()==3 ) {
            System.out.println((birincikr == ikincikr || birincikr == ücüncü || ikincikr == ücüncü)? "Kelime içinde aynı harfler vardır": "Kelimede bütün harfler farklıdır.");

            }else System.out.println("Kelimeniz 3 harfli değildir");
        }



    }
