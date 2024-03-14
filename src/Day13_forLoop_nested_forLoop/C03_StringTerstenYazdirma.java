package Day13_forLoop_nested_forLoop;

import java.util.Scanner;

public class C03_StringTerstenYazdirma {

    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin.


        //orn : input : Java candir ise output ne olmali :ridnac avaJ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bi metin giriniz");
        String metin = scanner.nextLine();


        for (int i = metin.length() - 1; i >= 0; i--) { // son karakterden baslasin ilk
            // harfe kadar yani 0. indexe kadar
            //indexi 1 azaltarak her harfi yazdirsin.


            System.out.print(metin.charAt(i)); // for loop un icinde charAt le yazdiriyorz
            // cünkü metin.length-1 le indeks seklinde metni geriye saydirdik charAt le
            // tekrar string haline getiriyoruz.



        }




    }






}



