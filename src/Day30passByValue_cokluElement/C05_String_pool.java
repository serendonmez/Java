package Day30passByValue_cokluElement;

public class C05_String_pool {
    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "Ali";
        String str3=  new String("Ali"); // böyle de yazilabilir
        String str4 = "A" + "li";
        String str5 = "A";
        String str6 = "li";
        String str7 =str5 + str6;
        String str8 = "a";
        String str9 =str8.toUpperCase().concat(str6);


        System.out.println("-------------------------------------------------");
        // equals methodu sadece metne odaklanir metinde farklilik varsa false ; yoksa true
        // == hem metne hem referansa bakar referans farkli ise metin ayni olsa da false verir


        System.out.println((str1 == str2)); //true
        System.out.println((str1 == str3));// false  // referans degisti
        System.out.println((str1 == str4));// true
        System.out.println((str1 == str7));// false Referans degisti
        System.out.println((str1 == str9));//false  Ref degisti
        System.out.println((str1.equals("Ali")));//true


        boolean check=false;

        str1+=check;
        System.out.println(str1);

        char a = 's';

        str1+=a;
        System.out.println(str1);



        System.out.println((str1.replace("Al", "us")));
        System.out.println(str1.substring(4, 7));
        System.out.println(str1.toUpperCase());
        str1+=a;
        System.out.println(str1);


    }
}
