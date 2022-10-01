package BenimJava.j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

/*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
     //task -> Kullanıcının girdiği rakamı yazı ile print eden code create ediniz.
        Scanner sc= new Scanner(System.in);
        System.out.print("Ağam Bir rakam bakam:");
 int rakam=sc.nextInt();
 switch(rakam){
     case 1: System.out.println("Ağam girdiğin rakam yazıyla \"sıfırdır\""); break;
     case 2:         System.out.println("Ağam girdiğin rakam yazıyla \"ikidir\"");
         break;
     case 3:
         System.out.println("Ağam girdiğin rakam yazıyla \"üçtür\"");
         break;
     case 4: System.out.println("Ağam girdiğin rakam yazıyla \"dörttür\"");break;
     case 5 :
         System.out.println("Ağam girdiğin rakam yazıyla \"beştir\"");break;
     case 6:
         System.out.println("Ağam girdiğin rakam yazıyla \"altıdır\""); break;
         case 7: System.out.println("Ağam girdiğin rakam yazıyla \"yedidir\""); break;
         case 8: System.out.println("Ağam girdiğin rakam yazıyla \"sekizdir\""); break;
         case 9: System.out.println("Ağam girdiğin rakam yazıyla \"dokuzdur\""); break;


         default : System.out.println("Ağam girdiğin rakam değil");


 }






    }
}
