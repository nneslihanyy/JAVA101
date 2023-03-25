import java.util.Scanner;

public class soru3
{
    //Bir eğitim kurumunda görev yapan öğretmenlere normal maaşlarına ek olarak, girdikleri ders saatine göre ek ders
    // ücreti ödenmektedir
    // . Ödenecek ek ders ücreti aşağıdaki şartlara göre verilmektedir.
    //a. Ders saati 10 saatten az ise ders saati başına 50 TL,
    //b. Ders saati 10 ile 20 saat arasında ise ders saati başına 51,5TL,
    //c. Ders saati 20 saatten fazla ise ders saati başına 53,5 TL,
    //Buna göre öğretmenin girilen ek ders saatine göre alacağı ek ders ücreti bulan program kodlarını yazınız.
    public static void main(String[] args) {
        double dersSaati,ucret;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç saat ders verdiniz?");
        dersSaati=scanner.nextDouble();
        if(dersSaati<10){
            ucret=dersSaati*50;
            System.out.println("Alacağınız ek ücret:"+ucret);
        }
        else if (dersSaati>=10&& dersSaati<=20) {
            ucret=dersSaati*51.5;
            System.out.println("Alacağınız ek ücret:"+ucret);
        }
        else if(dersSaati>20){
            ucret=dersSaati*53.5;
            System.out.println("Alacağınız ek ücret:"+ucret);
        }
    }
}
