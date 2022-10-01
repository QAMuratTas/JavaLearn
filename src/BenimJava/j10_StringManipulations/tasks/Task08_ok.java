package BenimJava.j10_StringManipulations.tasks;

public class Task08_ok {
    public static void main(String[] args) {

/*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfdepo ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf("M"));
        char a=harfDepo.charAt(harfDepo.indexOf("U"));
        char l=harfDepo.charAt(harfDepo.indexOf("R"));
        char u=harfDepo.charAt(harfDepo.indexOf("A"));
        char k=harfDepo.charAt(harfDepo.indexOf("T"));

        System.out.println(h+a+l+u+k);//asciii->toplama-> 373
        System.out.println(""+h+a+l+u+k);//string->concat-> HALUK ***********








    }
}
