import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kullanicidanAlinanSayi;
        int carpim=1;
        //"kullanicidanAlinanSayi" ve değeri 1 olan "carpim" adinda ikde değişken oluşturduk.("carpim adlı değişkeni for döngüsü içerisinde kullanacağız")

        Scanner kullanicidanAlinanSayiS = new Scanner(System.in);
        //"kullanicidanAlinanSayiS" adında Scanner kütüphanesi için nesne oluşturduk.

        System.out.println("Lütfen Sayı Giriniz:");
        kullanicidanAlinanSayi = kullanicidanAlinanSayiS.nextInt();
        //"kullanicidanAlinanSayiS" nesnesindeki kullanıcıdan girilen değeri "kullanicidanAlinanSayi" değişkenine attık.

        for (int i=1; i <= kullanicidanAlinanSayi ; i++){
            carpim *= i;
        }

        //Bir for döngüsü oluşturduk ve i yani (1) değeri "kullanicidanAlinanSayi" değerine ulaşana kadar i değerini 1'er 1'er arttırdık.
        //ardından (carpim *= i) diğer kullanımıyla (carpim = carpim * i) işlemini (bu işlem 1'den girilen sayıya kadar olan sayıları tek tek çarpmak için kullanılır)

        System.out.println("carpim:"+carpim);
        //ardından çarpımı ekrana yazdırdık.
    }
}
