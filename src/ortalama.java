import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        int matametik, fizik, kimya, tukce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matametik = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        tukce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (matametik + fizik + kimya + tukce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.print("Ortalamanız : " + sonuc);

        boolean durum = sonuc >= 60;
        System.out.print(durum ? "Sınıfı Geçti." : "Sınıfta Kaldı");

    }
}