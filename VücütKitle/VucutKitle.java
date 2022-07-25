package patikaDev.VücütKitle;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy,kilo,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        total = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+total);
    }
}
