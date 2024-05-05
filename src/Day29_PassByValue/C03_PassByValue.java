package Day29_PassByValue;

public class C03_PassByValue {

     static int sayi = 50;

    @Override
    public String toString() {
        return "C03_PassByValue{ }";
    }

    public static void main(String[] args) {

        int sayi = 10;

        // int sayi = 20; // Variable 'sayi' is already defined in the scope

        // boolean sayi = false ; // Variable 'sayi' is already defined in the scope

        sayi = 30;

        System.out.println(sayi);




       C03_PassByValue obj = new C03_PassByValue( 75);
        System.out.println(obj.sayi);


        System.out.println(sayi);



    }


    public static void method1(){

        int sayi  = 40;
        System.out.println(sayi); // 40
    }

    public static void method2 (int s){
        System.out.println(sayi); // 50
    }

    C03_PassByValue (int sayi){

        this();

    }

    C03_PassByValue(){



    } // parametresiz bi cons olusturduk , varsa classta parametresiz obje calissin diye



}
