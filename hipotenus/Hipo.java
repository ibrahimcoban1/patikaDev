package patikaDev.hipotenus;

import java.util.Scanner;

public class Hipo {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,cevre,alan,u;


        Scanner giris = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz :");
        kenar1 = giris.nextDouble();

        System.out.print("2.Kenarı Giriniz :");
        kenar2 = giris.nextDouble();

        System.out.print("3.Kenarı Giriniz :");
        kenar3 = giris.nextDouble();

        cevre = kenar1+kenar2+kenar3;
        u= cevre/2;
        alan = u * (u-kenar1) * (u-kenar2) * (u-kenar3);

        System.out.println("Üçgenin Çevresi :"+cevre);
        System.out.println("Üçgenin Alanı :"+alan);


    }
}
