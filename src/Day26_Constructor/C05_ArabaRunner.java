package Day26_Constructor;

public class C05_ArabaRunner {
    public static void main(String[] args) {

        // Sadece marka ve fiyatin atama yapilacagi bi const. olusturun;

        C04_Araba araba1 = new C04_Araba("Tesla", 15000);
        System.out.println(araba1);

        // Araba ozellikler ==> marka : 'Tesla', model : 'Model belirtilmedi', yil : 1900, fiyat=15000


        C04_Araba araba2 = new C04_Araba("Audi","A4",2020,35000);

        System.out.println(araba2);
        // Araba ozellikler ==> marka : 'Audi', model : 'A4', yil : 2020, fiyat=35000





    }







}
