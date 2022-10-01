package BenimJava.j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {
        /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("***");
        System.out.println("****Atm ye hoş Geldiniz***");
        System.out.println("Bakiye Öğrenme ->1\nPara Yatırma->2\nPara Çekme ->3\nÇıkış->4 \ngiriniz:");
        int seçim = sc.nextInt();
        int bakiye = 1000;
        switch (seçim) {
            case 1:
                System.out.println("Ağam Bakiyen:" + bakiye);

                break;
            case 2:
                System.out.println("Ağam ne kadar yatıracan :");
                int yatirilanmiktar = sc.nextInt();
                bakiye += yatirilanmiktar;
                System.out.println("Ağam bakiyenin güncel hali: " + bakiye);


                break;
            case 3:
                System.out.println("Ağam ne kadar para çekecen::");
                int cekilenmiktar = sc.nextInt();
                if (cekilenmiktar > bakiye) {
                    System.out.println("Ağam bakiyen yetersiz");
                    System.out.println("Güncel Bakiyen" + bakiye);

                } else {
                    bakiye -= cekilenmiktar;
                }
                break;
            case 4:
                System.out.println("Ağam Çıkışın yapıldı Güle Güle!!!");
                break;

            default:


        }
    }}
