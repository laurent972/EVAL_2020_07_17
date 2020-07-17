
package EVAL;

import java.util.Scanner;


public class Q2_correction {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n,i;
        long produit;
        System.out.print("Donnez la valeur de n: ");
        
        n=reader.nextInt();
        produit=1;
        for(i=1; i<2*n; i=i+2){
            produit=produit*i;
        }
        System.out.println("Le produit vaut: "+ produit);
    }
    
}
