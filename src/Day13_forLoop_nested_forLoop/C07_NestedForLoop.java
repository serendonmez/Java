package Day13_forLoop_nested_forLoop;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        /*
        nested for Loop kullanarak asagidaki tabloyu yazdirin:

        2 3 4 5 6           // tabloda satirlar i yi
        3 4 5 6 7           // sutunlar her satirdaki sutunu kontrol ediyor aralarindaki iliskiyi bulmaliyiz.
        4 5 6 7 8           // satir sayisi =4 (1 den 4 e kadar)
        5 6 7 8 9           // sutun sayisi 5 (1 den 5 e kadar)
                              // herhangi bi sayiyi sec , sayi hangi satirda ve sutunda ? sayilar arasindaki iliskiyi bul
                            // mesela ilk 2 1. satir 1 sutun , 1 + 1 = 2
                            // son 9 = 4. satir 5. sutun = 4+5 =9 yani satir + sutun formülüyle yazilmis.
                */


        for (int i = 1; i <=4; i++) {// satirlari kontrol edecek
            for (int j = 1; j <=5 ; j++) { // her satirdaki sütunlari kontrol edecek

                System.out.print(i+j+" "); // loop body de formulu yazdiriyoruz

            }
            System.out.println(""); // her satirdan sonra alt satira inmek icin loop body disina sout hiclik yazdiriyoruz.
        }






    }
}
