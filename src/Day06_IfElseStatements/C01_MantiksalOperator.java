package Day06_IfElseStatements;

public class C01_MantiksalOperator {
    public static void main(String[] args) {
        // && operatöru mukemmeliyetci
        // tüm sartlar true ise sonuc true
        // sartlardan biri bile false ise sonuc false dur.
        int a = 5;
        int b= 3;
        int c= 7 ;
        System.out.println( 2*a >= b+c && 3*b !=a+c && b+5 <a*c); // != esit degildir anlaminda

        // OR operatoru iyimserdir
        // tüm sartlar false ise sonuc false
        // sartlardan bir tanesi bile true ise true dur

        int d = 10;
        int e = 15;
        System.out.println(d>e || b>0) ; // d>e false b>0 true sonuc true

        // ||veya demek
        boolean g;
        // || toplama islemine benzer ( isin icinde bir tane 1 varsa ssonuc 0 olmaz.
        // && de false gelme ihtimali fazla, || de true gelme ihtimali fazla










    }
}
