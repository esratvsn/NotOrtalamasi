import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //değişkenleri tanımla
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfımızı tanımladık
        Scanner inp=new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik notunuzu giriniz: ");
        mat=inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:  ");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce=inp.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih= inp.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik=inp.nextInt();

        int toplam=(kimya+mat+turkce+fizik+muzik+tarih);
        double ort=toplam/6;

        System.out.println("Ortalamanız: "+ort);

        // Ternary operatörü ile sınıf geçme durumunu kontrol et
        String durum = (ort > 60) ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println(durum);


    }
}