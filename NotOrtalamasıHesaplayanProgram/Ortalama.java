package patikaDev.NotOrtalamasıHesaplayanProgram;
import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6.0;
        System.out.println("Ortalamanız :"+ortalama);

        String gecmeDurumu = (ortalama>60)?"Sınıfı Geçti" :"Sınıfta Kaldı";
        System.out.print(gecmeDurumu);
    }
}
