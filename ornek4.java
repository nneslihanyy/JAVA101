import java.util.Scanner;

/*Bir öğrencinin bir dersten aldığı başarı notunun hesaplanması şu şekilde olacaktır,
        a. Öğrenci 3 adet Kısa sınav, 2 adet Vize sınavına ve 1 adet Final sınavına girmektedir.
        b. Kısa sınav notları ve vize notları klavyeden girilerek bu notların aritmetik ortalamaları
        alınacaktır,
        c. Son olarak final notu girilerek, başarı puanı hesaplanıp ekrana yazılacaktır.
        d. Başarı puanı şu şekilde hesaplanmaktadır : BP = (KSort * 50/100 +Vort * 50 / 100 ) * 40/100
        + F * 60/100;
        Not : BP : Başarı puanı, KSort :Kısa sınavların not ortalaması, Vort :Vizelerin not ortalaması, F:
        Final Notu*/ 
public class ornek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kisa1,kisa2,kisa3,vize1,vize2,final1;
        double KSort,BP,Vort;
        while(true) {

            System.out.println("kisa sinavlarinizi giriniz(ardarda):");
            kisa1 = scanner.nextInt();
            kisa2 = scanner.nextInt();
            kisa3 = scanner.nextInt();
            System.out.println("vize sinavlarinizi giriniz:");
            vize1 = scanner.nextInt();
            vize2 = scanner.nextInt();
            System.out.println("final notunuzu giriniz:");
            final1 = scanner.nextInt();
            KSort = (kisa1 + kisa2 + kisa3) / 3;
            Vort = (vize1 + vize2) / 2;
            BP = (KSort * 50 / 100 + Vort * 50 / 100) * 40 / 100 + final1 * 60 / 100;
            System.out.println("Başari puaniniz:" + BP);
        }

    }
}
