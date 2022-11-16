package praktikum4soal2;

import java.util.Scanner;

public class PRAK4022110817310011MuhammadRaviHimawan {


    public static void main(String[] args) {
       String j = "";
       String p="";
       int t=0;
       String g = "";
       int v = 0;
       String s = "";
       
       Scanner switcher = new Scanner(System.in);
       System.out.println("Pilih buku yang diinputkan: ");
       System.out.println("1 = Novel");
       System.out.println("2 = Komik");
       
       int choice = switcher.nextInt();
       
       switch (choice) {
            case 1:
                Novel novel = new Novel (j, p, t, g, s);
                novel.display();
                System.out.println(novel.getNovelDetail());
                break;
            case 2:
                Komik komik = new Komik (j, p, t, v, s);
                komik.display();
                System.out.println(komik.getKomikDetail());
                break;
            default:
                System.out.println("Pilihan Invalid: ");
                break;
       
       }
    }
    
}
