package Day41_abstractClasses_Interfaces;

public abstract class C01_AbstractCar {

    //  bu classi ca uretmek isteyen tüm markalarin
    // kendilerine uyarlamasi gereken methodlari belirlemek icin olusturduk.


    // motoru mecbur yapalim
public abstract void motor () ;
// Abstract methods can not have a body

    // sun roof istege bagli
    public void sunroof(){

        // child clsslari kendisine uyarlama konusunda
        // serbest birakmak istedigimiz methodlari
        //concrete ( abstract olmayan) method olarak olustururuz

    }

    // yakit zorunlu olmali
    public abstract void yakit();

    // abstract method'lar concrete method'lar gibi
    // bir islem yapmak uzere DEGIL
    // child class'lari UYARLAMAYA MECBUR etmek icin kullanilir
    // standartlarda olan yazilar gibidir,
    // ornegin yakit method'u "Bir aracin car olabilmesi icin yakit method'u olmasi zorunludur"
    // anlamina gelir


    // geri gorus kamerasi zorunlu degil
    public void geriGoruskamerasi(){

    }

    // sanziman duz vites, otomatik vites zorunlu
    public abstract void sanzuman();


}
