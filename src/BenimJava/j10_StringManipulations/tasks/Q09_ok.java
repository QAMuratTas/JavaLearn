package BenimJava.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q09_ok {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
Scanner sc = new Scanner (System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime = sc.next();
        if (kelime.length() %2!= 0) {
            System.out.println("Girdiğiniz kelimenin karakter sayısı tek olduğundan dolayı bu şekilde bir çıktı alacaksınız:"+kelime.substring(0, (kelime.length())/2));}
        else {
        System.out.println("Girdiğiniz kelimenin yarısı:" + kelime.substring(0, (kelime.length())/2));}



    }
}
