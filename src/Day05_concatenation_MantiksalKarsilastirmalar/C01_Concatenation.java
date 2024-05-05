package Day05_concatenation_MantiksalKarsilastirmalar;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2 = " Candir" ;
        System.out.println(str1 + str2);



        System.out.println( str1 + 5);
        System.out.println(str1 + 5 + 6+str2); // Java56candir
        //burada islem önceligine dikkat edilmeli, soldan baslayarak toplanmali
        // metne dahil olan rakamlar artik string oldugu icin sonraki rakamla toplanmaz
        // concat edilir

        String q="Hello" ;
        int x= 2;
        int y = 3;
        System.out.println( q+x+y); //Hello23
        System.out.println(y+x+q); //5Hello
        System.out.println(q+(x+y)); //Hello5
        System.out.println(q+x*y); //Hello6


    }
}
