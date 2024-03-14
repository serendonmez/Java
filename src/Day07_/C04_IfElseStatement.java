package Day07_;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {

        //Kullanicidan mesafeyi kilometre olarak alin ve
        // cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.


        Scanner scann= new Scanner(System.in);
        System.out.println("Cevirmek istediginiz mesafeyi KM olarak giriniz");
        double mesafe1= scann.nextDouble();
        scann.nextLine(); // konsolda neyi yazamiyorsan önüne bunu yaz
        System.out.println("cevirmek istediginiz birimi girin");
        String cevrilecekbirim= scann.next();



        if (cevrilecekbirim.equalsIgnoreCase("metre") ){//equals string degerleri == karislatirmak icin kullanilir


        System.out.println("Girdiginiz mesafe metre olarak "+mesafe1*1000+" metredir");}
        else if (cevrilecekbirim.equalsIgnoreCase("santimetre")) {
            System.out.println("girdiginiz mesafe santimtre olarak "+mesafe1*100000+" santimetredir");

        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");}


        //      Scanner scanner = new Scanner( System.in) ;
  //      System.out.println(" Lütfen mesafeyi KM olarak girin :");
  //      double mesafe = scanner.nextDouble();
  //      System.out.println( " mesafeyi cevirmek istediginiz birimi giriniz :");
  //      String cevrilecekBirim = scanner.next();
//
  //      if ( cevrilecekBirim.equalsIgnoreCase( "metre")){  // String == opi le kullanimadigindan equalsla sorulur
  //          System.out.println("girilen mesafe metre olarak "+ mesafe*1000+" metredir");
  //      }else if (cevrilecekBirim.equalsIgnoreCase("santimetre")) {
  //          System.out.println("girilen mesafe cm olarak" + mesafe*100000 + "santimetredir");
  //      }else System.out.println("istedigniz mesafe sistme kayiTli degilsir");






















    }
}
