package Day04_wrapperClass_MatematikselIslemler;

public class C03_WrapperClasses {
    public static void main(String[] args) {


        // primitive data turleri sadece deger barindirir
        // non primitiv data turleri ise hem deger, hem hazir method lar barindirir.

        int sayi = 20 ;

        String str = " Java Candir" ;
        System.out.println(str.toUpperCase());



        char chr1 = 'a' ; // burada char primitiv oldugu icin hazir method u ypktur

        Character chr2 = 'b';

        System.out.println(chr2.charValue());
        System.out.println(Character.isLowerCase(chr1)); // is ile baslayan methodlar true/flase verir.

        System.out.println(Character.isDigit(chr1));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


    }

    }