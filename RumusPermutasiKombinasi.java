public class RumusPermutasiKombinasi {
 static int faktorial(int num){
     if(num==0){
         return 1;
     }
     return num*faktorial(num-1);
    } 
    int P = 0;
    void Permutasi (int np, int rp) {
    P = faktorial(np)/faktorial(np-rp);
        System.out.println(" ");
        System.out.println("PENYELESAIAN :");
        System.out.println("    Nilai dari  n!                = " + (faktorial(np)));
        System.out.println("    Nilai dari (n-r)!             = " + (faktorial(np-rp)));
        System.out.println("    Maka hasil permuttasinya (nPr)= " + (P));      
    } 
    int K = 0;
    void Kombinasi (int n, int r) {
    K = faktorial(n)/(faktorial(n-r)*faktorial (r));
        System.out.println(" ");
        System.out.println("PENYELESAIAN :");
        System.out.println("    Nilai dari  r!               = " + (faktorial(n)));
        System.out.println("    Nilai dari (n-r)!            = " + (faktorial(n-r)));
        System.out.println("    Nilai dari  r!               = " + (faktorial(r)));
        System.out.println("    Maka hasil Kombinasinya (nCr)= " + (K));
    }}