import java.util.Scanner;

public class ornek2
{
    //Kendisi hariç bütün pozitif çarpanları (tam bölenleri) toplamı, yine kendisine eşit olan sayılara "mükemmel sayı"
//denir. Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi. Buna göre klavyeden girilen bir tamsayının "mükemmel sayı" olup
//olmadığını kontrol eden programın kodlarını yazınız,

        public static void main(String[] args) {
        double toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mükemmel sayı mı:");
        double girilensayi=scanner.nextDouble();
        for(int i=1;i<girilensayi;i++){
            if(girilensayi%i==0){
                toplam+=i;
            }

        }
        if(toplam==girilensayi){
            System.out.println("girdiğiniz sayi mukemmel sayidir");
        }
        else if (toplam!=girilensayi)
        {
            System.out.println("mukemmel sayi degil");
        }
    }
    }


