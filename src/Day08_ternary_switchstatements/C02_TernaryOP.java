package Day08_ternary_switchstatements;

public class C02_TernaryOP {
    public static void main(String[] args) {
        // verilan bir tam sayinin cift sayi veya tek sayi oldugunu yazdirin.


        int sayi =40 ;
        if (sayi % 2 == 0) {
            System.out.println(" Sayi cift ");
        }else {
            System.out.println(" sayi tek ");
        }

        // Ternary OP
        //if else ile yapilabilecek BASIT islemler icin kullanilan
        // alternatif bir kod blogudur.

        System.out.println( sayi % 2 ==0 ? " sayi cift " : " tek ");



        // verilen sayi 0 dan büyükse pozitif ;
        // 0 dan büyük degilse pozitif degil yazdirin
        //


        int sayi1 = -258;
        if (sayi1 > 0) {
            System.out.println(" Pozitif");
        }else {
            System.out.println(" Pozitif degil ");

          //  ternary ile söyle yapilir

            System.out.println( sayi1 >0 ? " pozitif " : " pozitif degil");

            // ternary i if le yapilcak islem basit ise kullaniriz.

            // sayi 10 dan büyükse sayinin degeri ´ni 2 azaltin
            //sayi 10 büyük degilse sayinin degerini 5 atririn.

            if ( sayi > 10) {
                sayi -=2;




            }



        }





    }

}

