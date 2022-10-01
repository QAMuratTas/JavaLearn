package BenimJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TerneryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
       // int x=sc.nextInt();

      // String sonuc= (x%2==0) ? "çift sayı":"tek sayı";
       // hocanın yaptığı aşağıda
       //System.out.println(sonuc);

        //Scanner sc = new Scanner(System.in);
        System.out.println("agam bi tamsayı gir bakam : ");
        int agaSayisi = sc.nextInt();
        System.out.println("   ***  if-else   ***   ");
        if (agaSayisi % 2 == 0) {
            System.out.println("agam sayi ÇİFT");
        } else System.out.println("agam sayi TEK ");
        System.out.println("   ***  ternary   ***   ");
        // String sonuc  =(agaSayisi%2==0 ? "agam sayı ÇİFT" :"agam sayi TEK");//komut cıktısı String  type variable
        //   System.out.println("sonuc = " + sonuc);
        System.out.println(agaSayisi % 2 == 0 ? "agam sayı ÇİFT" : "agam sayi TEK");

        /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

        // tamsayını negative
        //System.out.println(x < 0 ? "negatif" : "pozitive");
    }
}
