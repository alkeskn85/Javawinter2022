package day34_accesModifier_encapsilation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj=new C01();

        obj.acikString="Bye";
        C01.acikSayi=50;


        //C01.sayi=10 private access modifier oldugudan baska class'dan ulasamayiz

        // ulasamayiz privat datalara sadece bulundugu class'ta ulasabiliriz

        //obj.method1; private access modifier'i oldugunudan baska class'ta ulasamayiz

        // C01 objParametreli=new C01(5); private access modifier'i oldugunudan baska class'ta ulasamayiz




    }
}
