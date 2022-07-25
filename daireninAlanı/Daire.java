package patikaDev.daireninAlanı;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double a,pi=3.14,alan;

        Scanner input =new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        r = input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        alan = (pi*(r*r)*a)/360;
        System.out.print("Dairenin Alanı : "+alan);

    }
}
