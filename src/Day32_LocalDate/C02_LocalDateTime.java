package Day32_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2024-04-03T20:33:48.748986

        /* tarihi ve saati belli formatta yazdirmak istiyorsak

        önce o formati olusturmaliyiz; sonra ldt yi istenen formatla yazdirabiliriz


        GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini
             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h
                 HH : saatin tamami, tek rakamli saat olursa 02 gibi HH:mm
                 H  : tek rakamli saat olursa sadece saati ->H:M

                 a yazarsak AM veya PM degerini yazar
         */
        // tarihi 03 Apr 24 seklinde yazdirin
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("\ndd  MMMM yy");
        System.out.println(ldt.format(dtf1));

        // 3 April 2024 Wednesday
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d MMM yyyy  EEEE");

        LocalDateTime heute = LocalDateTime.now();
        System.out.println(heute);

        DateTimeFormatter Ldt3= DateTimeFormatter.ofPattern("dd %%% M  y");
        System.out.println(heute.format(Ldt3)); // 06 %%% 4  2024 araya nok. isareti koyarsak onu da yazar


        // 3/4/2024 20:33

        DateTimeFormatter ldt3= DateTimeFormatter.ofPattern("d M YYYY h:m"); //6 4 2024 5:34
        System.out.println(heute.format(ldt3));


        // 8:33 pm
        DateTimeFormatter ldt4= DateTimeFormatter.ofPattern("HH:mm a "); // 05:34 vorm.
        System.out.println(heute.format(ldt4));




        LocalDateTime d = LocalDateTime.of(2023, 4,07,
                21,49, 56,89);

        Period p= Period.of(0,9,10);

        System.out.println(p);
        d=d.plus(p);
        DateTimeFormatter f= DateTimeFormatter.ofPattern("DD MMM YY HH:mm");

        System.out.println(d.format(f));



    }
}
