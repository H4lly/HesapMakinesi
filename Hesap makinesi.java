import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int sayi1, sayi2, sonuc;
        short secim;


        Scanner girdi = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1 = girdi.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = girdi.nextInt();
        System.out.print("Seçim yapınız (1=+,2=-,3=/,4=*) :");
        secim = girdi.nextShort();


        switch (secim) {

            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkartma : " + sonuc);
                break;
            case 3:
                sonuc = sayi1 / sayi2;
                System.out.println("Bölme : " + sonuc);
                break;
            case 4:
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma : " + sonuc);
                break;
            default:
                System.out.println("1,2,3,4 Dışında değer girdiniz.");
                break;
        }
    }
}