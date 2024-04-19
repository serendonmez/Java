package Day17_scope;

public class C04_staticVariableVSinstanceVariable {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String bashekimIsmi = "Dr Emrah";
    static String hastaneAdresi = "Cankaya";

    String persIsmi;
    String perAdresi;
    String perTel;

    public static void main(String[] args) {

        C04_staticVariableVSinstanceVariable pers1 =new C04_staticVariableVSinstanceVariable();

        System.out.println(pers1.perAdresi); // null

        pers1.persIsmi = "Ulvi";
        pers1.perAdresi = "Cankaya";
        pers1.perTel = "5552345665";


       //

    }
}
