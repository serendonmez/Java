package Day23_ListSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FibonacciSerisi {
    public static void main(String[] args) {
        //Verilen pozitif bir n tamsayisini alarak,
        // bize ilk n tane Fibonacci sayisini
        // bir list olarak donduren bir method olusturun.
        //       Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        System.out.println(fibonacciSerisiOlustur(12));



    }

    public static List<Integer> fibonacciSerisiOlustur(int sayiAdedi) {

        List<Integer> fibonacci =new ArrayList<>();








       if (sayiAdedi<=0){
           System.out.println("Lütfen 0'dan büyük bir sayi giriniz");
       }else if (sayiAdedi==1) {
           fibonacci.add(0); //0 . index belli
       } else if (sayiAdedi==2  ) { // 1. index belli
           fibonacci.add(1);
       }else { // sayiadedi> 0 durumlari icin
           fibonacci.add(0);
           fibonacci.add(1);

           for (int i = 2; i < sayiAdedi; i++) {


               fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
               //2.                //0.          //1.


           }

       }









        return fibonacci;
    }





}