package Day37_inheritance;

public class C03_Parent extends C02_GParent{

    C03_Parent(){
        System.out.println(" Parent parametresiz const");

    }

    C03_Parent(int b){
        System.out.println("Parent int parametreli cons.");
    }



    C03_Parent(String k){
        this(3);
        System.out.println("Parent String parametreli cons.");
    }

    C03_Parent(double t){
        super(7.2);
        t=7;
        System.out.println(t);
    }
}
