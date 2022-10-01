package BenimJava.j09_SwitchStatement.tasksSwitch;

import java.util.Scanner;

public class Task04_ok {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen ay giriniz:");
String ay = sc.next().toLowerCase();
 switch (ay) {
     case "ocak":
     case "mart":
     case "mayıs":
     case "temmuz":
     case "ağustos":
     case "ekim":
     case "aralık":
         System.out.println("Bu ay 31 gün çeker patron");
         break;
     case "nisan":
     case "haziran":
     case "eylül":
     case "kasım":
         System.out.println("Bu ay 30 gün çeker patron");
         break;
     case "şubat":
             System.out.println("Şubat ayı seçiminiz için yıl giriniz :");
             int yil=sc.nextInt();
             if ((yil%4==0)  &&  (yil %100!=0)  ||   (yil%400==0)) System.out.println("Şubat ayı girdiğiniz yıl 29 gün çeker patron");
             else System.out.println("Şubat ayı girdiğiniz yıl 28 gün çeker patron");
             break;


default:
    System.out.println("Lütfen geçerli bir ay giriniz*****");

 }
	}

}
