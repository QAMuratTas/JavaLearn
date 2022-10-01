package BenimJava.j09_SwitchStatement.tasksSwitch;

import java.util.Scanner;

public class Task03_ok {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
             case 5:
                 System.out.println("Cuma");
                 break;
                 case 6:
                     System.out.println("Cumartesi");
                                          break;
                default:
                    System.out.println("Gün sayısı 1-7 arasında olmalıdır patron");

        }



    }
}
