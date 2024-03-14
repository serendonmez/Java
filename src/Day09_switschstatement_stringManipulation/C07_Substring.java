package Day09_switschstatement_stringManipulation;

public class C07_Substring {
    public static void main(String[] args) {

        String str= "Java cok güzeldir";

        System.out.println("FFFFFFFFFFFF");
        System.out.println(str.substring(2)); // 0-1- va guzeldir- /beginindex icine yazdigimiz sayiya denk gelen
        //harften baslayarak metni sonuna kadar yazdirir index olarak 2. indeksten baslayarak 2. dahil.
        System.out.println("GGGGGGGGGGGGGG");
        System.out.println(str.substring(0)); // Java guzeldir 0 index ten baslar yani en bastan
        System.out.println("LALALALAL");

        System.out.println(str.substring(str.length() - 1));// length-1 = son karakter length j1a2v3.. 1 den baslar
        System.out.println("RRRRRRRRRRRR");

        System.out.println(str.length()-1);// length i bulmak icin
        System.out.println(str.charAt(str.length() - 1));// son karakter = subst(str.length-1))


        System.out.println(str.length());// length = 13 = Endindex = 12 demek
        // yani length-1 = Endindex

        System.out.println("AAA");
        System.out.println(str.substring(str.length() - 1)); // r son index



        System.out.println(" sssssss");

        System.out.println(str.substring(7)); //zeldir dinamic degil

        System.out.println(str.length()); // uzunlugu 24 iken Endindex i = 23 dinamic cod

        // son 6 harfi yazdir
        String ibanno = "123456789876543223456";

        System.out.println(ibanno.substring(ibanno.length()-4) );


    }
}
