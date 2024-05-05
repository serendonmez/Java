package Day03_scanner_dataCasting;

public class C07ValueOf {
    public static void main(String[] args) {


        int number= 10;
        System.out.println(number);
        String str= String.valueOf(number);
        double dbl= 12.5;
        str= String.valueOf(dbl);
        System.out.println(str);

        System.out.println("355"+str);





        String str1= "10";

        int e ;
        e= Integer.parseInt(str1);
        System.out.println(e);

        int z= 154;
        String r= "9";
        String t;
        t= String.valueOf(z);
        System.out.println("2");
        System.out.println(t+r);





        String c=" 10 tl";
        String d= "  158  tl";
        // c+d ?


        c= c.replaceAll("\\D","");
        d=d.replaceAll("\\D","");

        int f= Integer.parseInt(c)+Integer.parseInt(d);
        System.out.println(f);




        //

        char ch = 'A';
        String str4 = Character.toString(ch);
        System.out.println(str4); //A





    }
}
