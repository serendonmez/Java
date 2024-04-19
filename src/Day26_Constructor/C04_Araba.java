package Day26_Constructor;

public class C04_Araba {


    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    /*
        EGER
        Constructor icinde instance variable'lara atama yapmak istersek
        constructor'a parametre yazabiliriz

        - parametre isimleri instance variable isimlerinden farkli ise
          marka = mrk
          bu atamada mrk'nin parametre, model'in ise instance variable oldugu
          acikca belli oldugundan java ekstra bilgiye ihtiyac duymaz

        - parametre isimleri ile instance variable isimleri ayni ise
          marka = marka
          bu atama anlamsiz olur
          icinde oldugumuz scope'da marka variable oldugundan
          Java class level'daki instance varible'lara bakmaz

          Objeye ait(instance) marka'yi belirtmek icin
          this. kullanilmalidir

          this. kullanildiginda
          java icinde bulundugumuz scope'a bakmadan
          direk class level'a bakar
     */



    C04_Araba(){ // daha sonra soruna neden olmamak
        // icin bir Cons olusturuyoruz.
        // body sinde cod olmamali

    }



    C04_Araba(String mrk, int fyt){ // Co5 te bu class tan obje olusturduk oradaki
        // araba1 objesinin vari lari bu const ile uyumlu.

        marka= mrk;
        fiyat= fyt;


    }


    public C04_Araba(String marka, String model, int yil, int fiyat) {
        this.marka = marka; // this. kullaninca direk class a bakariz
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    @Override
    public String toString() {
        return "C04_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }











}





