import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //Bir çalışanın brüt maaşı çalıştığı saate göre hesaplanmaktadır. Çalıştığı her saat için 100TL ücret almaktadır.
    // Brüt maaşın %15’i sigorta primi için ve brüt maaşın %10’u devlete vergi olarak ayrılmaktadır.
    // Buna göre çalışanın saat bilgisi klavyeden girildikten sonra alacağı net maaşı hesaplayan ve
    // ekrana brüt maaşı, sigorta primi, vergi ve net maaş bilgilerini yazan programı yazınız.
    public static void main(String[] args) {
       double saat,brutmaas,sigortaprim,vergi,netmaas;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç saat çalışıyorsunuz?");
        saat=scanner.nextDouble();
        brutmaas=saat*100;
        sigortaprim=(brutmaas*0.15);
        vergi=(brutmaas*0.10);
        netmaas=brutmaas-sigortaprim-vergi;
        System.out.println("Brüt maaşınız:"+brutmaas);
        System.out.println("Sigorta Priminiz:"+sigortaprim);
        System.out.println("Vergi Miktarı:"+vergi);
        System.out.println("Net maaşınız:"+netmaas);
    }
}