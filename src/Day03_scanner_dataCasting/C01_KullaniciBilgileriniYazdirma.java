package Day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz.");

        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("Lütfen yasinizi giriniz.");
        int yas = scanner.nextInt();
        System.out.println("isminiz :" + isim +

                "\nsoyisminiz :" + soyisim +

                "\nyasiniz : " + yas +

                "\nKaydiniz basariyla tamamlanmistir"        );






        // Kullanicidan isim, soyisim, yasini al asagidaki formatta yazdir
        /* isminiz
        Soyisminiz:
        Yasiniz:
        KAydiniz basariyla tamamlanmistir.
         */



        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lütfen isminizi giriniz");

        String iSim= scan.nextLine();

        System.out.println("Lütfen soyisminizi girin");
        String soyIsim = scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");

        int Yas= scan.nextInt();

        System.out.println(" Isminiz : " + iSim +
                          "\nSoyisminiz : " + soyIsim +
                            "\nYasiniz:  " + Yas +
                           "\nKaydiniz basariyla tamamlanmitir.");











    }
}
