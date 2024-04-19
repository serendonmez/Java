package Day37_inheritance;

import Day38_inheritance.C01_Parent;
import Day38_inheritance.C03_Hayvanlar;

public class C04_Child extends C03_Parent {

    /*
            Child class'da olusturulan her objenin
            parent class'daki ozelliklere de sahip olabilmesi icin
            Java extends kullanan bir class'daki,
            her constructor'in ILK SATIRINDA
            constructor call olma mecburiyeti koymustur

            ilk satirda gorunur bir constructor call varsa
            Java o constructor call'a uygun olarak calisir
            Eger ilk satirda GORUNUR bir constructor call yoksa
            Java default olarak PARAMETRESIZ super() koyar
         */
    C04_Child() {
        System.out.println("Cild Parametresiz const.");
    }

    C04_Child(int a) {
        System.out.println("Child int parametreli cons.");
    }

    C04_Child(String s) {
        super(5);
        System.out.println("Child String parametreli cons");
    }

    C04_Child(String a, int b) {
        super("Ali");
        System.out.println("Child 2 parametreli cons.");
    }


    C04_Child(double c) {
        super(2.3);
        System.out.println(c);
    }

    public static void main(String[] args) {

        // C04_Child child1 = new C04_Child();
        // C04_Child child2 = new C04_Child(4);
       // C04_Child child3 = new C04_Child("ali");
        //C04_Child child4 = new C04_Child("a",1);
         C02_GParent child5 = new C04_Child(1.1);

        // C04_Child class iken --> Gparent parametresiz const
        //5.0
        //7.0
        //1.1

        //C03_Parent class iken -->  Gparent parametresiz const
        //5.0
        //7.0
        //1.1


    }
}