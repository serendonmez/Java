package Day12__stringManipulations_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {
        //1 den 100 e kadar olan sayilari yazdirin
        // Java da tekrar eden islemler icin looplar kullanilir



        for (int i=1; i<=100 ; i++) {
            System.out.print(i+" ");
        }


        System.out.println("     "); // alt satira inmek icin bolsuk
        System.out.println("          ");



        // 34'den baslayip 3'er 3'er artirarak
        // 100'e kadar(100 haric) sayilari yazdirin

        // 34, 37, 40.....
        for (int i = 34; i <100 ; i+=3) {
            System.out.print(i+" ");

        }

        System.out.println("   ");


        // // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        for (int i = 10; i < 100; i++) {// 7 ile bölünme sartini if ile kontrol edin

            if (i%7==0){
                System.out.print(i+" ");
            }



        }

























    }
}
