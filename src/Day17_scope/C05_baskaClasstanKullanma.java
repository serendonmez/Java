package Day17_scope;

public class C05_baskaClasstanKullanma {
    public static void main(String[] args) {

        /*
            Method'lar ve Class level variable'lar
            baska class'lardan da kullanilabilir

            Static variable ve method'lara
            baska class'dan ulasmak icin
            classIsmi.classUyesiIsmi kullanilir
            bu sekilde kullanima static yontem denir

            Instance variable'lari baska class'dan kullanmak icin
            instance variable'in oldugu class'dan bir obje olusturulmalidir


         */

        System.out.println(C04_staticVariableVSinstanceVariable.bashekimIsmi);

        C04_staticVariableVSinstanceVariable pers = new C04_staticVariableVSinstanceVariable();
        System.out.println(pers.perAdresi);

        System.out.println(pers.bashekimIsmi); // Dr.Emrah
        // Static member 'bashekimIsmi' accessed via instance reference

        // static bir uyeye obje uzerinden ulasmak isterseniz
        // Java otomatik olarak getirmez ama yazarsaniz kabul eder
        // IntelliJ'de static bir uyeye, nicin static olmayan yontemle ulasiyorsun
        // diye o kodu sariya boyar
    }
}


