package Day14_MEthodOlusturma;

import java.util.Scanner;

public class C04_Palindrome {
    public static void main(String[] args) {

        // Verilen metin palindrome ise true,
        // palindrome degilse false donduren bir method olusturun

        System.out.println(isPalindrome("Ey edip adanada pide ye"));
        System.out.println(isPalindrome("sanane"));
        System.out.println(isPalindrome("MAdam"));


    }



    public static boolean isPalindrome (String metin){
        String tersMetin ="";// for dan önce soruda bizden istenene bos atama yapariz.

        for (int i = metin.length()-1 ; i >=0; i--) {
            tersMetin +=metin.charAt(i);



        }
        if (metin.equalsIgnoreCase(tersMetin)){
            return true;

        }else {
            return false;
        }


    }

}
