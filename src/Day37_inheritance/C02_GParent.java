package Day37_inheritance;

public class C02_GParent {

C02_GParent(){
    System.out.println(" Gparent parametresiz const");
}

C02_GParent(double z){
    this();
    z=5;
    System.out.println(z);
}

}
