package Karl_teacher;

public class TaskEx02 {
    public static void main(String[] args) {
        // + operatoru sayisal degerlerde kullanilinca aritmetik islem yapar.
        // + operatoru degerlerden biri String oldugu takdirde concat (String olarak birbirine ekleme) islemi yapar.
        // Degerler sadelestirilirken oncelikle islem onceligi goze alinir.
        // Tum islem oncelikleri ayni ise soldan saga dogru islem yapilir

        System.out.println("5 ile 3 un toplami =" + (5 + 3));
        //1 -> System.out.println("5 ile 3 un toplami =" + (5 + 3));
        //2 -> System.out.println("5 ile 3 un toplami =" + 8);
        //3 -> System.out.println("5 ile 3 un toplami =8");

        // Soldan saga hesaplama yapilir.
        System.out.println("5 ile 3 un toplami =" + 5 + 3);
        //1 -> System.out.println("5 ile 3 un toplami =" + 5 + 3);
        //2 -> System.out.println("5 ile 3 un toplami =5" + 3);
        //3 -> System.out.println("5 ile 3 un toplami =53");
    }
}
