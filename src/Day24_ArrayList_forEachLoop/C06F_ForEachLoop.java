package Day24_ArrayList_forEachLoop;

import javax.sound.midi.Soundbank;
import java.util.*;

public class C06F_ForEachLoop {
    public static void main(String[] args) {

       // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.



        Scanner scanner= new Scanner(System.in);
        System.out.println(" Lütfen bir cümle girin");
        String cumle = scanner.nextLine();

        String harf ="";

        while (harf.length()!=1){  // user harf yrine kelime girerse
            System.out.println(" lütfen bir harf girin");
            harf= scanner.nextLine();

        }

 //      int toplam =0;

 //      for (int i = 0; i < cumle.length() ; i++) {
 //          if (harf.charAt(0)==cumle.charAt(i)){
 //              toplam++;

 //          }

 //      }
 //      System.out.println(" girdigniz harf cümlede "+ toplam+ " kullanilmis");

        String [] harfArrayi= cumle.split(""); // hicliklerine ayirina bize cümledeki tüm harfleri eleman olarak iceren
        // bir arr verir.System.out.println(Arrays.toString(harfArrayi));




     int sayac =0;
     // eachharf = disardan girdigimiz bir harfi cümlede aratiyoruz

     for ( String eachHarf: harfArrayi  ) {  // foreach loop array yada list ten olur ; yani döngüdeki aramayi
            if (eachHarf.equalsIgnoreCase(harf))     { // bir list ya da array den yapar
                sayac++;

            }

     }
     if (sayac==0){
         System.out.println(" harf cümlede kullanilmamis");
     }else {
         System.out.println(" verilen" +harf+ " harfi cumlede "+ sayac+ " defa kullanilmis");
     }





















  //   int sayac=0;
  //   for (int i = 0; i <cumle.length(); i++) {
  //       if (cumle.charAt(i)==harf.charAt(0)){
  //           sayac++;
  //       }
  //   }
  //   if (sayac > 0) {
  //       System.out.println("Harf cümlede " + sayac + " kez kullanıldı.");
  //   } else {
  //       System.out.println("Harf kullanılmamış.");
  //   }
  //   System.out.println(" SSSSSSSSSSSSSSSSSSSSSS");





   //   String harf= "";

   //   while(cumle.length()!=1)
   //       System.out.println("Lütfen bir harf girin");
   //       harf= scanner.nextLine();


   //  // for( String each : cumleHarf){

   //   }




    }
}
