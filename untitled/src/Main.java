import java.util.Random;
import java.util.Scanner;

public class Main {
//Toplama işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun başladığı zaman rastgele 2 tane 1-100 arasında sayı tutulacak,
// tutulan sayılar ekrana gösterilecek ve kullanıcıya bu sayıların toplamı nedir diye sorulacaktır. Eğer kullanıcı doğru cevap verirse
// “Tebrikler Bildiniz” değil ise “Üzgünüm Bilemediniz” diye mesaj verecektir. Her cevaptan sonra “Tekrar Oynamak istiyormusunuz(e/E)?”
// şeklinde bir soru sorulacak ve eğer kullanıcı “e” veya “E” ile karşılık verirse oyun tekrar başlayacaktır.
// Kullanıcının puanı her doğru cevap için 5 puan artacak, her yanlış cevap için ise 2 puan azalacaktır.
// Oyun sonlandığında kullanıcının verdiği doğru cevap sayısı,
// yanlış cevap sayısı ve puanı ekranda listelenmelidir. Bu işlemleri yapan programın kodlarını yazınız.

    public static void main(String[] args) {
        double sayi1,sayi2,toplam=0,puan=0,dcadet=0,yanlıscadet=0;
        char secim;

        do{
         Scanner scanner=new Scanner(System.in);
         Random random=new Random();
         sayi1=1+random.nextInt(100);
         sayi2=1+random.nextInt(100);
         System.out.println("1. Sayı:"+sayi1);
          System.out.println("2. Sayı:"+sayi2);
         System.out.println("Bu sayıların toplamı nedir?");
         toplam=scanner.nextDouble();
         if(toplam==(sayi1+sayi2)){
       System.out.println("Tebrikler bildiniz");
       puan=puan+5;
       dcadet++;
        }
        else{
       System.out.println("Üzgünüm bilemediniz");
       puan=puan-2;
       yanlıscadet++;
          }
    System.out.println("Tekrar Oynamak istiyormusunuz(e/E)");
   secim=scanner.next().charAt(0);
  if(secim!='e'||secim!='E'){
      break;
  }
} while(true);
        System.out.println("Doğru Cevap Sayınız:"+dcadet);
        System.out.println("Yanlış Cevap Sayınız:"+yanlıscadet);
        System.out.println("Kazandığınız Puan:"+puan);
    }
}