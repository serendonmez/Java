package Day32_LocalDate;

import java.util.Arrays;

public class C04_varargs {
    public static void main(String[] args) {

        // verilen farkli adetlerdeki sayilarin
        // ilki haric geriye kalanlari toplayip
        // ilk sayi ile bu toplami carpip yazdiran bir method olusturun

        islem(2);
        islem(2,3,4);
        islem(2,4,5,6,7);
        islem(0,2,3,4,5,6,7,8,9,5);



        go("Lale","orkide","menekse");


    }


    public  static  void  islem (int ilkSayi, int ... kalanSayilar){
        int toplam =0;


        for ( int each  : kalanSayilar  ) {
            toplam+=each;

        }
        System.out.println(toplam*ilkSayi);


    }


    public static void go (String ilkmetin , String ikinciMetin, String ... b){



       for ( String each:  b ) {

          if (ilkmetin.contains("orkide")){


          }


       }
        System.out.println(ilkmetin.substring(1));



    }



   // public static void enAzUcElemanli (String ... renkler, String ilkRenk,){    }


        // varargs basta calismaz en sona koyulmali ve bir method ta  sadece bi tane olur


}
