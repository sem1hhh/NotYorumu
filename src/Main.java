import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner konsolVeri = new Scanner(System.in);

        System.out.print("Notunu gir: ");
        int not = konsolVeri.nextInt();

        while(not>100) {
            System.out.println("Naptın soru mu ekledin?");
            System.out.print("Düzgünce yaz güzelim: ");
            int not2 = konsolVeri.nextInt();
            not=not2;

        }
        if (not <= 30) {
            System.out.println("Biraz daha çalış kanka haha");
        }
        //while(not>100);

        else if (not<100 && not>30)  {
            System.out.println("Çalışmışsın cimcime");
        }

        System.out.println("Neyse devam");

        System.out.print("İsmini yaz: ");
        String isim = konsolVeri.next();

        // int not = 2;
        //boolean GecmeDurumu = true;
        //float ortalamasi= 3f;
        //String isim= "sude";

        //System.out.println("Durumun: " + GecmeDurumu);
        //System.out.println("Ortalaman: " + ortalamasi);
        System.out.println("Notun: " + not);
        System.out.println("Isim: " + isim);

        konsolVeri.close();


    }



}


