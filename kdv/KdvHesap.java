package patikaDev.kdv;
import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double kdvsiz,kdvli,kdvoran,kdv;
        boolean kdvDurum;

        Scanner veri = new Scanner(System.in);
        System.out.print("Ürünün Fiyatını Giriniz :");
        kdvsiz = veri.nextInt();

        kdvDurum = (0<kdvsiz)&&(1000>kdvsiz);
        kdvoran = kdvDurum ? 0.18 : 0.08;

        kdv = kdvsiz * kdvoran;
        kdvli = kdvsiz+kdv;

        System.out.println("KDV Tutarı :"+kdv);
        System.out.println("KDV'li Fiyat"+kdvli);




    }
}
