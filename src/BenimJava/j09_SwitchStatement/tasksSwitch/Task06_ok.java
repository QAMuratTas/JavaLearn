package BenimJava.j09_SwitchStatement.tasksSwitch;

import java.util.Scanner;


public class Task06_ok {

    public static void main(String[] args) {
        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("V.İ.P DE ÖĞRENMEK İSTEDİĞİNİZ HARFİ GİRİNİZ: ");
        char harf = sc.next().charAt(0);

        switch (harf) {
            case 'v':
            case 'V':
                System.out.println("V=very");
                break;
            case 'i':
            case 'I':

                System.out.println("I=important");
                break;
            case 'p':
            case 'P':

                System.out.println("P=person");
                break;
			default:
				System.out.println("vip harici olmasın lütfennn ****");

		}
    }
}