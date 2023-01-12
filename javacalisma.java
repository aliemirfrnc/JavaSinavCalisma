import java.util.Scanner;
//Scanner(kullanıcıdan veri almak için kullanılan kütüphane) kütüphanesini kurduk.
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner sayi1S = new Scanner(System.in);
        Scanner sayi2S = new Scanner(System.in);
        Scanner sayi3S = new Scanner(System.in);
        //"sayi1","sayi2","sayi3" adında değişkenler oluşturduk.
        //"sayi1S","sayi2S","sayi3S" adında Scanner kütüphanesi için nesneler oluşturduk.

        System.out.println("1. Notu Giriniz:");
        sayi1 = sayi1S.nextInt();//"sayi1S" nesnesindeki kullanıcıdan girilen değeri "sayi1" değişkenine attık.
        System.out.println("2. Notu Giriniz:");
        sayi2 = sayi2S.nextInt();//"sayi2S" nesnesindeki kullanıcıdan girilen değeri "sayi2" değişkenine attık.
        System.out.println("3. Notu Giriniz:");
        sayi3 = sayi3S.nextInt();//"sayi3S" nesnesindeki kullanıcıdan girilen değeri "sayi3" değişkenine attık.

        int ortalama = (sayi1+sayi2+sayi3)/3;//ortalama bulduran işlemi yaptırıp "ortalama" değişkenine atadık

        if (ortalama < 50){
            System.out.println("Ortalamanız:"+ortalama+"/Kaldınız");
            //System.out.println("Kaldınız"); kafanın karışmasını istemezsen sadece bunuda yazabilirsin.
        }
        else{
            System.out.println("Ortalamanız:"+ortalama+"/Geçtiniz");
            //System.out.println("Geçtiniz"); kafanın karışmasını istemezsen sadece bunuda yazabilirsin.
        }
        //ortalama 50'den küçükse ekrana "kaldınız" değilse "geçtiniz" yazan koşulu oluşturduk.
    }
}
