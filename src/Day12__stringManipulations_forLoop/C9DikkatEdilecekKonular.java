package Day12__stringManipulations_forLoop;

public class C9DikkatEdilecekKonular {
    public static void main(String[] args) {
        // i'ye atanan ilk deger icin
        // loop body calisma sarti false oluyorsa
        // loop body'si hic calismadan loop biter

        for (int i = 10; i <0 ; i++) { // ilk sayi 10 10<0 false
                                     // daha ilk kod dan calismaz hiclik

            System.out.println(i);

        }

        // i'nin degisimi ile
        // hic bir zaman loop sarti false olmuyorsa
        // buna sonsuz loop denir

        for (int i = 0; i <10 ; i--) { // 0<10 saglar -1<10 saglar -2<10 saglar
                                        // döngü sonsuz calisisr

            System.out.print(i);

        }
    }
}
