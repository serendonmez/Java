package Day12_;

public class C01_stringdenSayiTopla {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi
//         String fiyatlari toplayip yazdirin.
//    input1 : "15.30 €" , input2 : "11.40 €"
//    output : 26.70 €


        String sayi1 = "15.30 €";
        String sayi2 = "11.40";

        // stringle toplama parsing le mümkün


        sayi1=sayi1.replaceAll("\\D","");
        sayi2=sayi2.replaceAll("\\D","");

        System.out.println( " sayilarin toplami: "+ ((Double.parseDouble(sayi1)+Double.parseDouble(sayi2))/100)+
                " € ");














    }
}
