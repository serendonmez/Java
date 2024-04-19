package Day14_MEthodOlusturma;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class C07_PalindromeNumber {
    public static void main(String[] args) {
        //     * write a return method to Palindrome Number

        //     * Input : 12345 Output : 54321
        System.out.println(PalindromeSayi(123));


    }

    public static int PalindromeSayi(int sayi) { // 1234 123  12 1

        int tersSayi=0;
        int temp =sayi;
        int kalan=0;

        while (temp>0){

            kalan=temp%10; // --> birlerB

            temp=temp/10; // --> sayinin son bas sildin

            tersSayi=tersSayi*10+kalan; // 0 *10 +4 = 4 --> 4*10 +3 =43 -->

        }


        return tersSayi;





    }
}