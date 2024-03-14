package Day09_switschstatement_stringManipulation;

import java.util.Scanner;

public class C09_deneme {
    public static void main(String[] args) {

        // kullanicidan 2 basamakli sayi alip, girilen sayiyi yazi ile yazdirin.


        System.out.println("2 basamaklı pozitif bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();
        if (sayi >= 10 && sayi <= 99) {
            int birlerBasamagi = sayi % 10;
            int onlarBasamagi = sayi / 10;
            switch (onlarBasamagi) {
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kirk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmis ");
                    break;
                case 7:
                    System.out.print("yetmis ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
            }
            switch (birlerBasamagi) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }


        }else {
            System.out.println("Lütfen gecerli bir sayi giriniz.");}

    }
}







     //  switch (onlarBasamagi){
     //      case 1 :
     //          System.out.println("On");
     //      case 2:
     //          System.out.println("yirmi");
     //          break;
     //      case 3:
     //          System.out.println("otuz");
     //          break;
     //      case 4 :
     //          System.out.println("kirk");
     //          break;
     //      case 5:
     //          System.out.println("elli");
     //          break;
     //      case 6:
     //          System.out.println("altmis");
     //          break;
     //      case 7:
     //          System.out.println("yetmis");
     //          break;
     //      case 8:
     //          System.out.println("seksen");
     //          break;
     //      case 9:
     //          System.out.println("doksan");
     //          break;
     //      default:
     //          System.out.println("lütfen gecerli bir sayi girin");
     //  }

     //  switch (birlerBasamagi) {
     //      case 1:
     //          System.out.println("bir");
     //          break;
     //      case 2:
     //          System.out.println("iki");
     //          break;
     //      case 3:
     //          System.out.println("üc");
     //          break;
     //      case 4:
     //          System.out.println("dört");
     //          break;
     //      case 5:
     //          System.out.println("bes");
     //          break;
     //      case 6:
     //          System.out.println("alti");
     //          break;
     //      case 7:
     //          System.out.println("yedi");
     //          break;
     //      case 8:
     //          System.out.println("sekiz");
     //          break;
     //      case 9:
     //          System.out.println("dokuz");
     //          break;
     //      default:
     //          System.out.println("lütfen gecerli bir sayi giriniz");

     //  }


