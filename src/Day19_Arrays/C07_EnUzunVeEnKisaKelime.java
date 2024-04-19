package Day19_Arrays;

public class C07_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        //Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih","Mustafa"};

            enUzunEnKisa(isimler);



    }

    public static void enUzunEnKisa(String [] isimler){

        String enKisa =isimler [0]; // meltem
        String EnUzun = isimler [0]; // arr data türünde elemanlarin length karislastirmasi yapilacaksa
        // array e bos luk atamak yerine ilk arrayi digerleriyle kiyasla
        // String enUzun= isimler[0];
        // if


        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].length()<enKisa.length()){
                enKisa= isimler[i];

            } else if (isimler[i].length()>EnUzun.length()) {
                    EnUzun= isimler[i];

            }


        }
        System.out.println("arrayin en kisa elemani : "+ enKisa);
        System.out.println("arrayin en uzun elemani: "+ EnUzun);








    }


}
