package BenimJava.j11_MethodCreation;
//Römork
public class C04_MethodDepo {
    // main method olmayacak
    //main method-> motor olmayacak -> malzeme taşıyon romörk

    /*
    her class'da main method mecburiyeti yoktur. belilrli aksiyonlara özel class'lar tanımlanabilir..
     */

    public static void gecmeNotu (int not) {
        if (not >= 85) {
            System.out.println("Ağam tebrik çook başarılı :)");

        } else if (not >= 70) {
            System.out.println("Ağam başarılı!");

        } else if (not >= 60) {
            System.out.println("Ağam  saadece geçtin !");

        } else if (not >= 45) {
            System.out.println("Ağam ucuz yırttın");

        } else System.out.println("Ağam fena çaktın:(");

    }
    public static void topla (int a,int b){
        System.out.println("toplam :"+(a+b));
    }

}