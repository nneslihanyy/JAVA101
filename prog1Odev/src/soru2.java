import java.util.Scanner;

public class soru2
{
    //Ekmeği 5 TL, poğaçayı 7,5TL, simidi 5 TL ‘den satan bir fırıncı kazancının %18’i vergi vermektedir.
    // Fırıncının sattığı ürün sayısı ürün çeşitlerine göre klavyeden girildikten sonra fırıncının kazancı ve
    // ödemesi gereken vergi hesaplayıp
    // bu bilgileri ekrana yazdıran programın kodlarını yazınız.
    public static void main(String[] args) {
        double ekmeksayisi,pogacasayisi,simitsayisi,kazanc,vergi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Satılan ekmek sayısını giriniz:");
        ekmeksayisi=scanner.nextDouble();
        System.out.println("Satılan poğaça sayısını giriniz:");
        pogacasayisi=scanner.nextDouble();
        System.out.println("Satılan simit sayısını giriniz:");
        simitsayisi=scanner.nextDouble();
        kazanc=(ekmeksayisi*5)+(pogacasayisi*7.5)+(simitsayisi*5);
        vergi=(kazanc*0.18);
        System.out.println("Kazancınız:"+kazanc);
        System.out.println("Ödemeniz gereken vergi miktarı:"+vergi);



    }
}
