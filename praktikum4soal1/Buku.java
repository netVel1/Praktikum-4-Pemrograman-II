package praktikum4soal1;

import java.util.Scanner;


public class Buku {
    private String judul;
    private String penulis;
    private int tahun;
    Scanner buku = new Scanner(System.in);
    
    
    public Buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
        
        
        System.out.print("Judul: ");
        judul = buku.nextLine();
        System.out.print("Penulis: ");
        penulis = buku.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = buku.nextInt();
    }
    
    public void display (){
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah " + judul);
        System.out.println("Penulis adalah " + penulis);
        System.out.println("Tahun Terbit adalah " + tahun);
    }

}
