package praktikum4soal2;

import java.util.Scanner;

public class Novel extends Buku{
    private String genre;
    private String sinopsis;
    Scanner buku = new Scanner(System.in);

    public Novel(String j, String p, int t, String g, String s){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
        this.genre = g;
        this.sinopsis = s;
        
        System.out.print("Judul: ");
        judul = buku.nextLine();
        System.out.print("Penulis: ");
        penulis = buku.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = buku.nextInt();
        System.out.print("Genre: ");
        buku.nextLine();
        genre = buku.next();
        System.out.print("Sinopsis: ");
        buku.nextLine();
        sinopsis = buku.nextLine();
    }
    
    public String getNovelDetail(){
        return "Sebuah novel bergenre " + genre + " dengan judul " + judul +
                ". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + "." +
                "\nSinopsis: " + sinopsis;
    }

}
