import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kullanicidanAlinanSayi;
        int toplam=0;
        //"kullanicidanAlinanSayi" ve "toplam"("toplam"a 0 değerini atadık çünkü null yani boş girilirse hata veriyor) adinda iki tane değişken oluşturduk.("toplam adlı değişkeni for döngüsü içerisinde kullanacağız")

        Scanner kullanicidanAlinanSayiS = new Scanner(System.in);
        //"kullanicidanAlinanSayiS" adında Scanner kütüphanesi için nesne oluşturduk.

        System.out.println("Lütfen Sayı Giriniz:");
        kullanicidanAlinanSayi = kullanicidanAlinanSayiS.nextInt();
        //"kullanicidanAlinanSayiS" nesnesindeki kullanıcıdan girilen değeri "kullanicidanAlinanSayi" değişkenine attık.

        for (int i=1; i <= kullanicidanAlinanSayi ; i++){
            toplam += i;
        }

        //Bir for döngüsü oluşturduk ve i yani (1) değeri "kullanicidanAlinanSayi" değerine ulaşana kadar i değerini 1'er 1'er arttırdık.
        //ardından (toplam += i) diğer kullanımıyla (toplam = toplam + i) işlemini (bu işlem 1'den girilen sayıya kadar olan sayıları tek tek toplamak için kullanılır)

        System.out.println("toplam:"+toplam);
        //ardından toplamı ekrana yazdırdık.
    }
}
