package BenimJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("agam yilini   gir : ");
        int yil = sc.nextInt();

        // 4'un katı       100'un katı olmamamsı    400'un katı olması
        if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
            System.out.println("girdiğiniz yil artık yıl  :-)");
        }else {
            System.out.println("giridiğinz yıl artık yıl değildir  :-(");
        }

    }
}
