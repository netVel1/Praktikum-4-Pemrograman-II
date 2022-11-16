package praktikum4soal2;

import java.util.Scanner;

public class Komik extends Buku{
    private int volume;
    private String sinopsis;
    Scanner buku = new Scanner(System.in);
    

    public Komik(String j, String p, int t, int v, String s){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
        this.volume = v;
        this.sinopsis = s;
        
        
        System.out.print("Judul: ");
        judul = buku.nextLine();
        System.out.print("Penulis: ");
        penulis = buku.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = buku.nextInt();
        System.out.print("Volume: ");
        volume = buku.nextInt();
        System.out.print("Sinopsis: ");
        buku.nextLine();
        sinopsis = buku.nextLine();
    }
    
    public String getKomikDetail(){
        return "Sebuah komik dengan judul " + judul + ". Komik tersebut dibuat oleh " + penulis +
                " dan diterbitkan pada tahun " + tahun + ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak "
                + volume + " buah." +
                "\nSinopsis: " + sinopsis;
    }

}
