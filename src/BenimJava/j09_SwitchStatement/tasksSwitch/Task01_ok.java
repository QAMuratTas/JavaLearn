package BenimJava.j09_SwitchStatement.tasksSwitch;

import java.util.Scanner;

public class Task01_ok {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        int onlar =sayi/10 ;
        sayi =sayi-(10*onlar);


        switch (sayi) {
            case 0 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***sıfırdır***"   );
                 break;
            case 1 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***birdir***"   );
                break;
            case 2 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***ikidir***"   );
                break;
            case 3 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***üçtür***"   );
                break;
            case 4 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***dörttür***"   );
                break;
            case 5 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***beşdirr***"   );
                break;
            case 6 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***altıdır***"   );
                break;
            case 7 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***yedidir***"   );
                break;
            case 8 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***sekizdir***"   );
                break;
            case 9 :
                System.out.println("girdiğiniz sayının onlar basamağı değeri ***dokuzdur***"   );
                break;

                default:
                // burada bir şey yazmaya gerek yok diye düşünüyorum.



        }




    }
}
