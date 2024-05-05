package Day34_StringBuilder;

public class C04_Compare {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ulvi");
        StringBuilder sb2 = new StringBuilder("Ulvi");
        String str = "Ulvi";

        // ==

        System.out.println(sb1 == sb2); // false
        // System.out.println(str == sb1); // Farkli data turundeki non-primitive'ler icin == KULLANILAMAZ




        System.out.println(sb1.equals(sb2)); // false,  Metin ayni da olsa FALSE verir
        System.out.println(str.equals(sb1)); // false, Java CTE vermez ama sonuc hep FALSE olur

        System.out.println(sb1.equals(sb1)); // true

        StringBuilder sb3 = sb1;

        System.out.println(sb1.equals(sb3)); // true


        // StringBuilder'da metinleri karsilastirmak icin compare() kullanilir
        // compareTo() 0 dondururse metinler ayni,
        // 0'in disindaki tum degerler icin metinler farklidir

        // compareTo() iki sb'i ilk index'den baslayarak harf harf karsilastirir
        // Eger tum index'lerdeki karakterler ayni ise sonuc olarak 0 doner
        // Eger herhangi bir index'de farkli karakter bulursa,
        // bu karakterlerin ascii kodlari  arasindaki farki dondurur ve islemi sonlandirir

        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("Tava");
        StringBuilder s3 = new StringBuilder("Javaa");
        StringBuilder s4 = new StringBuilder("Java");
        StringBuilder s5 = new StringBuilder("Jaka");


        System.out.println(s1.compareTo(s2)); // -10 Java<==>Tava  J K L M N O P Q R S T
        System.out.println(s1.compareTo(s3)); // -1  Java<==>Javaa
        System.out.println(s1.compareTo(s4)); // 0
        System.out.println(s1.compareTo(s5)); // 11  Java<==>Jaka  v u t s r q p o n m l k



        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);

        String isim="Mesut";

        sb.append(isim, 2, 4);

        sb.delete(4, 6);

        System.out.println(sb);
        System.out.println("2222222222");



        StringBuilder sb10 = new StringBuilder("OCAJP8");

        sb10.subSequence(2, 4);  // kaydetmez Cünkü charsequens döndürür


        sb10.deleteCharAt(3); // kaydeder cünkü String  builder döndürür. -->OCAP8

        sb10.reverse( ); // kaydeder cünkü String builder döndürür --> 8PACO

        System.out.println(sb10);


    }
}
