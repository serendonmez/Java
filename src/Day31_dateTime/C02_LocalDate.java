package Day31_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class C02_LocalDate {
    public static void main(String[] args) {


        LocalDate tarih= LocalDate.now();

        System.out.println(tarih); //2024-04-06

        LocalDate japonyaTarih= LocalDate.now(ZoneId.of("Japan")); // 2024-04-06
        // zone un ilk harfini büyük yazmazsak hata veriyo
        System.out.println(japonyaTarih);



            // istenen tarih
        LocalDate dogumGunu1= LocalDate.of(1994, Month.JANUARY,9);

        LocalDate dogumGunu2 = LocalDate.of(1995,5,27);

        System.out.println(tarih.plusYears(30).plusWeeks(35).plusDays(50));
        //2055-01-26

        System.out.println(tarih); // yukaeda sadece yazdirdik kaydetmedik

        // verilen iki dogum tarihinden eski olani yazdirin

        System.out.println(dogumGunu1.isBefore(dogumGunu2)?dogumGunu1:dogumGunu2); //1994-01-09

        // verilen yilin artik yil olup olmadigini yazdirin


        System.out.println(dogumGunu1.isLeapYear()); // false


    }
}
