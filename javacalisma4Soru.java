import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int devamsızlıkSuresi;
        //"devamsızlıkSuresi" adında bir değişken oluşturduk

        Scanner devamsızlıkSuresiS = new Scanner(System.in);
        //"devamsızlıkSuresiS"adında Scanner kütüphanesi için nesne oluşturduk.

        System.out.println("Lütfen Devamsızlık Süresini Girin:");
        devamsızlıkSuresi = devamsızlıkSuresiS.nextInt();
        //"devamsızlıkSuresiS" nesnesindeki kullanıcıdan girilen değeri "devamsızlıkSuresi" değişkenine attık.

        if (devamsızlıkSuresi >= 30){
            System.out.println("Devamsızlık Sayınız:"+devamsızlıkSuresi+"/Devamsızlıktan Kaldınız.");
            //System.out.println("Devamsızlıktan Kaldınız."); kafanın karışmasını istemezsen sadece bunuda yazabilirsin.

        }
        else{
            System.out.println("Devamsızlık Sayınız:"+devamsızlıkSuresi+"/Devamsız Değilsiniz.");
            //System.out.println("Devamsız Değilsiniz."); kafanın karışmasını istemezsen sadece bunuda yazabilirsin.
        }
        //devamsızlık süresi 30 ve 30'dan büyük olursa kaldığını 30'dan küçük olursa kalmadığını yazan koşulu oluşturduk.
    }
}
