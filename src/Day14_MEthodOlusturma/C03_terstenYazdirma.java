package Day14_MEthodOlusturma;

public class C03_terstenYazdirma {
    public static void main(String[] args) {

        // verilen metni tersten yazdiran bir method olusturun

        terstenYazdirma(" method olusturmak güzeldir");
        terstenYazdirma("java o kadar da zor degil");

    }


public static void terstenYazdirma (String metin){ // yazdiran dedigi icin void




    for (int i = metin.length()-1; i >= 0; i--) {
        System.out.print(metin.charAt(i));



    }
    System.out.println("");


}







}
