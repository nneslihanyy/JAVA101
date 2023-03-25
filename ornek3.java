import java.util.Scanner;

public class ornek3 {
   /* İdeal kilo hesabı yapan bir program yazılmak istenmektedir. Programın çalışması şu şekilde
    olmalıdır. Kişinin boy(cm olarak girildiği düşünülecek-örnek:170), yaş, cinsiyet(Erkek için E, kız
    için K bilisi girildiği düşünülecek) ve o andaki kilosu (kg olarak girildiği düşünülecek-örnek: 65)
    klavyeden girilerek aşağıdaki formüle göre ideal kilosunu hesaplanacaktır ve ekrana
    yazdırılacaktır. İdeal kilosu ekrana yazdırıldıktan sonra öğrencinin kilo farkını ekrana
    yazdırılmalıdır (örnek: 10 kilo vermelisiniz veya 2,5 kilo almalısınız veya tebrikler ideal
                    kilonuzdasınız).
    a. İdeal Kilo = ( boy–100 + yaş/10 )*K formülü ile hesaplanır,
    b. K sabiti için eğer cinsiyet kız ise K = 0,8 alınmalı,
    c. K sabiti için eğer erkek ise K = 0,9 alınmalı,*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int boy,yas,kilo;
       double ideal=0,ver=0;
       char cinsiyet;
       System.out.println("yasinizi giriniz: ");
       yas = scanner.nextInt();
       System.out.println("boyunuzu giriniz: ");
       boy = scanner.nextInt();
       System.out.println("kilonuzu giriniz: ");
       kilo = scanner.nextInt();
       System.out.println("cinsiyetinizi giriniz: ");
       cinsiyet = scanner.next().charAt(0);
       if(cinsiyet == 'E'){
           ideal = (boy-100+yas/10)*(0.9);
           if (ideal<kilo){
               ver = (int)(ideal-kilo);
               System.out.println(ver+"kilo vermeniz gerekmektedir.");
           }
           else if (kilo<ideal){
               ver = (int)(ideal-kilo);
               System.out.println(ver+"kilo almaniz gerekmektedir.");
           }
           else if (kilo==ideal){

               System.out.println("ideal kilonuzdasiniz tebrikler...");
           }
       }
       if(cinsiyet == 'K'){
            ideal = (boy-100+yas/10)*(0.8);
           if (ideal<kilo){
               ver = (int) (kilo-ideal);
               System.out.println(ver +"kilo vermeniz gerekmektedir.");
           }
           else if (kilo<ideal){
               ver =(int) (ideal-kilo);
               System.out.println(ver+"kilo almaniz gerekmektedir.");
           }
           else if (kilo==ideal){
               System.out.println("ideal kilonuzdasiniz tebrikler...");
           }
       }
   }
}
