package Day32_LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class C01_LocalDate {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunuTarihi = LocalDate.of(1990,05,01);

        System.out.println(dogumGunuTarihi.until(bugun)); //P 33Y11M5D



        // verilen zamanlar arasindaki farki bir variable a kaydetmek istersek
        Period yasim = dogumGunuTarihi.until(bugun);
        System.out.println("eeeeeeee");
        System.out.println(yasim.getYears()); //33



        System.out.println(dogumGunuTarihi.until(bugun).getYears()); //33

        System.out.println(bugun.lengthOfMonth()); // 30 (icinde oldugumuz ay 30 gün)
        System.out.println(bugun.lengthOfYear());  // 366 artik yil bu yil 366 gün.
        System.out.println(bugun.getDayOfYear());  // 97 yilin kacinci günü oldugunu döndürür.
        System.out.println("wwwwwwwwwwwwwwwwwwwwwwwww");

       // System.out.println(LocalDate.of(2015, Calendar.FEBRUARY, 1)); //feb 1 yazdiriyor jan = 0
        System.out.println(LocalDate.of(2015, Month.APRIL,1));
        System.out.println( LocalDate.of(2015,4,1));
        System.out.println("jjjjjjjjjjjjj");

        LocalDate date =LocalDate.of(2014, 6, 21);
        System.out.println(date);// 2014-06-21

        LocalDate date1 =LocalDate.of(2014, Month.JUNE, 8);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date2.getYear() + " " + date2.getMonth() + " "
                + date2.getDayOfMonth());


    }





}
