package Day49_NestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_NestedOgrenciMapiOlusturma {

    public static void main(String[] args) {

        /*
       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

        // Map olarak yukardaki rezervasyon bilgilerini olusturalim

        Map< String , Object > rezervasyonMapi = new HashMap();
        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);

        Map<String,String> bookingdatesMapi = new HashMap<>();
        bookingdatesMapi.put("checkin","2024-07-21");
        bookingdatesMapi.put("checkout","2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesMapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi);

        /*
            {
              firstname=Ahmet,
              additionalneeds=wi-fi,
              bookingdates=   {
                                checkin=2024-07-21,
                                checkout=2024-08-10
                                },
              totalprice=500,
              depositpaid=false,
              lastname=Bulut
              }
         */


        // rezervasyondaki ismi yazdirin

        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet

        // rezervasyondaki fiyat 400'den buyukse
        // %10 indirim yapip, yeni halini kaydedin

        int eskiFiyat = (int) rezervasyonMapi.get("totalprice");

        if (eskiFiyat>400){
            // fiyati %10 indirimli hali ile update edin
            rezervasyonMapi.put("totalprice", eskiFiyat*90/100);
        }

        System.out.println(rezervasyonMapi);
        // {firstname=Ahmet, additionalneeds=wi-fi, bookingdates={checkin=2024-07-21, checkout=2024-08-10},
        // totalprice=450, depositpaid=false, lastname=Bulut}

        System.out.println(rezervasyonMapi.get("bookingdates")); //checkin=2024-07-21,
        //checkout=2024-08-10

        System.out.println(bookingdatesMapi.get("checkin"));//2024-07-21

       ( (Map<String,String>)rezervasyonMapi.get("bookingdates")).get("cehickin");



    }
}
