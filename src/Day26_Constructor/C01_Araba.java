package Day26_Constructor;

public class C01_Araba {



    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba(){
        // Biz bir class'da gorunur bir constructor olusturdugumuzda
        // Java default constructor'i SILER
        // Bu durumda daha onceden default cons.'i kullanarak
        // olusturulan objeler CTE verir
        // Kodun problem yasamamasi icin
        // gorunur bir cons olusturdugumuzda
        // HEMEN default cons. yerine de
        // gorunur bi r parametresiz cons. olusturmaliyiz
    }



    C01_Araba(String mrk, String mdl ,int yl , int fyt) {
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;

    }


    public C01_Araba(String marka) {  // parantez icinde atadigimiz var i yi
        // method icinde kullanirken scope sorunu yasamayiz ; ancak Cons da
        // parantez ici vari varsa cons icinde bunu kullanirken scope sorunu yasariz
        // bunun icin vari adini this. seklinde belirtiriz.
        this.marka = marka;
    }





    @Override
    public String toString() {
        return "C01_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';


    }
}
