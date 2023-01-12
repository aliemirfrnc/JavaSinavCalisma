import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayiAl;//"sayiAl" adında değişken oluşturduk.

        Scanner sayiAlS = new Scanner(System.in);//Bu kısım kullanıcının girdiği veriyi almak için Scanner sınıfını kullanır.
        System.out.print("1 ile 7 arasında sayı girin ");

        sayiAl = sayiAlS.nextInt();//Bu kısım kullanıcının girdiği sayıyı değişkene atar.

        switch (sayiAl) {//Bu kısım switch-case yapısının başlangıcıdır. SayiAl değişkeninin değerine göre case'ler arasında geçiş yapar.
            case 1://Bu kısım switch içinde SayiAl değişkeninin değeri 1 olduğunda çalışır.(bütün case yapılarında aynı mantık kullanıldı)
                System.out.println("Pazartesi");
                break;//Bu kısım case içindeki işlemler bittikten sonra döngüyü keser.
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            }

        }
        
}   
