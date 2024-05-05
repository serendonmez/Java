package Day13_forLoop_nested_forLoop;

import java.util.Scanner;

public class C01_FaktoryelSorusu {
    public static void main(String[] args) {


        // Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // or : 5!= 5*4*3*2*2*1 ==120


        Scanner scann = new Scanner(System.in);
        System.out.println("14 ten kücük pozitif tamsayi girin : ");
        int sayi = scann.nextInt();


        // toplam toplam icin, faktoryel istiyorsa faktoryel vb.  icin
        // etkisiz bir deger atamaliyiz
        // toplamda 0 carpimda 1 gibi

        int faktoriyel = 1;


        System.out.print(sayi+"!= ");

        



            for (int i =sayi; i >= 1; i--) { // faktoriyel hesaplanirken azalir.

                // loop un icine döngüden cikan sayilari
                // faktoryel formulüne dahil etmeliyiz.
                faktoriyel *= i; // her yeni i degeri faktoriyel icinde
                // isleme girsinni yani carilsin


                // mesela 13 girdik loop döngüsünde 13 ilk olarak
                // sarta uyuyor mu diye bakiliyor 13>=1 ; true o halde yazdiriliyor
                // soradöngüde faktoriyel formülüyle karsilasiyor
                // oraya yaziliyro
                // sonra döngüde i-- formülüne gidiyor ve orda degeri 1 azaliyor
                // yeni deger 13-1=12
                // 12 >=1 ; true o halde loop döngüsüne devam ediyor ve
                // faktoriyel formülüne katiliyor
                // döngü bu sekilde sayi>=1 bu sarti saglanamayana kadar devam ediyor
                // sart saglanmazsa loop bitiyor ve sonuc konsolda okunuyor

                if (i!=1) {
                    System.out.print(i + " * ");
                }else {
                    System.out.print( i+" ");




                }



            }




            System.out.print(" = " + faktoriyel); // faktoryel in son degerini loop disinda yazdiriyoruz.



        }




    }













