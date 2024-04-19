package Day19_Arrays;

public class C04_tekVeCiftUzunluktakiKelimeleriSay {
    public static void main(String[] args) {
        //// verilen bir String array'deki
        //// her bir kelimeyi kontrol edip
        //// array'de kac tane tek sayi uzunlugunda,
        //// kac tane cift sayi uzunlugunda kelime bulundugunu yazdiran bir method olusturun

        String[] arr = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih", "nezihe"};

        TekCiftUzunluktakiElementleriSay(arr);

    }

    public static void TekCiftUzunluktakiElementleriSay(String[] arr){ //


        int tekOlanlar= 0;
        int ciftOlanlar =0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length()%2==0){  // kac tane vardir gibi sayma
                // sorularinda eger elemanlarin sayisini birer artiriroyrsak i++; yapariz
                // toplam soruyorsak o zaman Toplam+=i; deriz.
                ciftOlanlar++;


            }else if (arr[i].length()%2!=0) {
                tekOlanlar++;

            }

        }


        System.out.println("arraydeki elemanlardan cift uzunluktakilerin sayisi : "+ ciftOlanlar+
                "\narraydeki elemanlardan tek uzunluktakilerin sayisi: "+ tekOlanlar);
        


    }






}
