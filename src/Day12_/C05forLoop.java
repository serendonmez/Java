package Day12_;

public class C05forLoop {
    public static void main(String[] args) {


        // iki basamakli pozitif tamsayilarin toplamini yazdirin

        int toplam = 0;



        for (int i = 10; i < 100; i++) { // ilk degeri 10

            toplam += i; // i ne getirirse onu toplama ekliycek 10-11-12...



        }


        System.out.print(toplam + " ");


        System.out.println("                    ");





        //// 10 ile 50 arasindaki(sinirlar dahil) 9 ile bölnebilen sayilarin toplamini yazdirin
        //    // 18 , 27, 36,45....



        toplam = 0;


        for (int i =10; i <=50 ; i++) {
            if(i%9 ==0){
                toplam +=i; // 9 bölünebilen her i degerini toplama ekle.


            }


        }

        // sout u for Loop bittikten sonra yapariz,
        System.out.println(toplam);

        System.out.println("                      " );

        // 2 basamakli pozitif ve negatif tum sayilarin toplamini yazdirin
        System.out.println("");


        toplam=0;

        for (int i = -99; i <100 ; i++) { // arada negatif ve pozitif rakamlar var
            if (!(i>-10 && i<10)){ // -10<i<10 araligini almamak icin if le araligi cikardik
                                   // yani i o aralikta deger almazsa toplama ekle dedik
                toplam +=i;
            }

        }
        System.out.println(toplam);

























    }





}