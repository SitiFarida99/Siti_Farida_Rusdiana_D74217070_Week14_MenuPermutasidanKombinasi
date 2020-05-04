
import java.util.Scanner;

public class ProsesPermutasiKombinasi {
         public static void main (String[] args) {
   RumusPermutasiKombinasi RPK = new RumusPermutasiKombinasi();
     Scanner in = new Scanner (System.in);
      for(int y = 1;;y++){
        System.out.println(" ");
        System.out.println("===================================================");
        System.out.println("Menu Permutasi dan Kombinasi");
        System.out.println("1. Mencari Permutasi"); 
        System.out.println("2. Mencari Kombinasi");
        System.out.println("===================================================");
        System.out.print("     Masukkan pilihan anda:");
        System.out.println(" ");
        y=in.nextInt();
        switch(y){
            case 1 :
                System.out.println("===================================================");
                System.out.println("    MENCARI PERMUTASI :");
                System.out.println("                          n!");
                System.out.println("Rumus Permutasi (nPr) :---------");
                System.out.println("                       (n-r)!");
                System.out.println("===================================================");
                System.out.print(" Masukkan Nilai banyaknya objek  keseluruhan (n) :");
                int np = in.nextInt();
                System.out.print(" Masukkan Nilai banyaknya objek yang diamati (r) :");
                int rp = in.nextInt();
                RPK.Permutasi(np, rp);
                break;
            case 2 :
                System.out.println("===================================================");
                System.out.println("    MENCARI KOMBINASI :");
                System.out.println("                             n!");
                System.out.println("Rumus Kombinasi (nCr) :-------------");
                System.out.println("                        (n-r)! x r!");
                System.out.println("===================================================");
                System.out.print(" Masukkan Nilai banyaknya objek  keseluruhan (n) :");
                int n = in.nextInt();
                System.out.print(" Masukkan Nilai banyaknya objek yang diamati (r) :");
                int r = in.nextInt();
                RPK.Kombinasi(n, r);
                break;
                }}}}