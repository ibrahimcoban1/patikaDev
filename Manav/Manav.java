package patikaDev.Manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,total;
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican =5.00;

        Scanner input =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        armut *= armutKg;
        elma *= elmaKg;
        domates *= domatesKg;
        muz *= muzKg;
        patlican *= patlicanKg;

        total = armut+elma+domates+muz+patlican;
        System.out.print("Toplam tutar : "+total+" TL");


    }
}
