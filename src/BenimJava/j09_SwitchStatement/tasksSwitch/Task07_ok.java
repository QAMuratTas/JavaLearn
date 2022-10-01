package BenimJava.j09_SwitchStatement.tasksSwitch;

import java.util.Scanner;

public class Task07_ok {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
int birler = sayi%10, onlar = (sayi/10)%10 ,yüzler = sayi/100;
        switch (yüzler) {
            case 1:
                System.out.print("yüz");
                break;
            case 2:
                System.out.print("ikiyüz");
                break;
            case 3:
                System.out.print("üçyüz");
                break;
            case 4:
                System.out.print("dörtyüz");
                break;
            case 5:
                System.out.print("beşyüz");
                break;
            case 6:
                System.out.print("altıyüz");
                break;
            case 7:
                System.out.print("yediyüz");
                break;
            case 8:
                System.out.print("sekizyüz");
                break;
            case 9:
                System.out.print("dokuzyüz");
                break;



        }


switch (onlar) {
    case 1:
        System.out.print("on");
        break;
    case 2:
        System.out.print("yirmi");
        break;
    case 3:
        System.out.print("otuz");
        break;
    case 4:
        System.out.print("kırk");
        break;
    case 5:
        System.out.print("elli");
        break;
    case 6:
        System.out.print("altmış");
        break;
    case 7:
        System.out.print("yetmiş");
        break;
    case 8:
        System.out.print("seksen");
        break;
    case 9:
        System.out.print("dosan");
        break;}

    switch (birler) {
        case 1:
            System.out.print("bir");
            break;
        case 2:
            System.out.print("iki");
            break;
        case 3:
            System.out.print("üç");
            break;
        case 4:
            System.out.print("dört");
            break;
        case 5:
            System.out.print("beş");
            break;
        case 6:
            System.out.print("altı");
            break;
        case 7:
            System.out.print("yedi");
            break;
        case 8:
            System.out.print("sekiz");
            break;
        case 9:
            System.out.print("dokuz");
            break;





    }




    }
    }

