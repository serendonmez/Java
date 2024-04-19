package Day36_encapsulation_inheritance;

import Day35_AccesModifier.C02Depo;

public class C01FarkliPackageChildClass extends C02Depo {

    public static void main(String[] args) {
        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02Depo.defaultStr);
        System.out.println(C02Depo.protectedStr);
        System.out.println(C02Depo.publicStr);

        C01FarkliPackageChildClass depo = new C01FarkliPackageChildClass();
        //System.out.println(depo.privateSayi);
       // System.out.println(depo.defaultSayi);
         System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

       // System.out.println(C04_Palindrome.isPalindrome("Java Candir")); // false
      
    }
}
