package BenimJava.day04;

public class Q07_StringManipulation {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        String s="abcdxyzi";
        boolean xyzIceriyorMu = true;

        if (s.contains("xy.z")) {
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);

        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }



    }


}
