package BenimJava.j11_MethodCreation;
// Motor
 /*
    farklı class'dan method call etmek için..
    1. method static_> gökteki güneş gibi
    2.ClassName.methodName() şeklinde call edilir
     aynı class'daki method doğrudan methodName ile call edilir...
      */


public class C04MethodCreation {
    public static void main(String[] args) {
        String name ="haluk";
        System.out.println("adın "+name);
        C04_MethodDepo.gecmeNotu(99);// depo class'tan name ile method call ettik

    C04_MethodDepo.topla(24,44);
selamVer();
    }
public static void selamVer (){

    System.out.println("ağam selamlar devam");
}


}

