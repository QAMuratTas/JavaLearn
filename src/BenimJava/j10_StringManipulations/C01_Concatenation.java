package BenimJava.j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
  /*
  concat () methodu içine(parametre) aldığı string variable 'ı çalıştığı stringin sonuna ekler
  java'da işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.

   */
        String name = " Nur";
        String meslek = " Qa tester";
        System.out.println(name.concat(meslek));
        System.out.println(name);
  // Trıck-> String method'ları variable geçici değişiklik yapar
  // ama değişken atama yapılırsa kalıcı değişir.
  name= meslek.concat(name);
        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :) ;
        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder
    }
}
