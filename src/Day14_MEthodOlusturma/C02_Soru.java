package Day14_MEthodOlusturma;

import org.w3c.dom.ls.LSOutput;

public class C02_Soru {
    public static void main(String[] args) {
        // verilen iki sayidan büyük olani yazdiran bir method olusturun
        // eger sayilar esitse , " esit sayilar da buyuk olan yoktur " desin

        buyukOlaniYazdir(7,8); // 8
        buyukOlaniYazdir(5,5); // sayilar esitse yazdirmaz.
        buyukOlaniYazdir(7,5);  // 7


    }



    //classin icinde main methodun disinda olmali
    // eger yazdrimali isek void kullaniriz!!!!
    // sadece deger tama olsaydi?

    public static void buyukOlaniYazdir(int sayi1, int sayi2){

        if (sayi1>sayi2){
            System.out.println("sayilardan büyük olan : "+ sayi1);
        } else if (sayi2>sayi1) {
            System.out.println(("sayilardan büyük olan: " + sayi2));

          //  }else ()

        }
    }




}
