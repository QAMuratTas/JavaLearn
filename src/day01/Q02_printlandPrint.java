package day01;

import org.w3c.dom.ls.LSOutput;

public class Q02_printlandPrint {
    public static void main(String[] args) {
        /*
   konsolda
   1
   2
   3
   4
   5
   yazdiriniz
   sonrasinda da  yanyana 12345 yazdiriniz
    */
          /*
  println() ve print() arasinda tek fark var;
  println satir atliyor,
  print ise imlecin ayni satirda kalmasini sagliyor.
    Konsolda
    *****println*****
    Welcome
    to
    Java
    Class
    *****print*****
    Welcome to Java Class yazdirinz
   */
        System.out.println("*****println*****");
        System.out.println("welacome");
        System.out.println("to");
        System.out.println("java");
        System.out.println("class");
        System.out.println("*****println*****");
        System.out.print("Welcome to Java Class");



 /*
   konsolda
   1
   2
   3
   4
   5
   yazdiriniz
   sonrasinda da  yanyana 12345 yazdiriniz
    */

        System.out.print("\n1\n2\n3\n4\n5"+"\n12345");

        byte bytemin = Byte.MIN_VALUE;
        byte bytemax = Byte.MAX_VALUE;
        short shortmin = Short.MIN_VALUE;
        short shortmax = Short.MAX_VALUE;
        int integermin = Integer.MIN_VALUE;
        int integermax = Integer.MAX_VALUE;
        long longmin = Long.MIN_VALUE;
        long longmax = Long.MAX_VALUE;
        double doublemin = Double.MIN_VALUE;
        double doublemax = Double.MAX_VALUE;
        char charmax=Character.MAX_VALUE;

        System.out.println("doublemax = " + doublemax);
        System.out.println("doublemax = " + doublemin);
        System.out.println("longmax = " + longmax);
        System.out.println("longmin = " + longmin);
        System.out.println("integermax = " + integermax);
        System.out.println("integermin = " + integermin);
        System.out.println("shortmax = " + shortmax);
        System.out.println("shortmin = " + shortmin);
        System.out.println("bytemax = " + bytemax);
        System.out.println("bytemin = " + bytemin);

        }
    }



