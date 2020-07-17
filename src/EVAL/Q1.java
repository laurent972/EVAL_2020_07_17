
package EVAL;

import java.util.Scanner;


public class Q1 {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n,i;
      
        System.out.print("Ecrire n: ");
        n=reader.nextInt();
        int tab[] = new int[n];
        
        if(n % 2 == 0){
            for(i=0; i<n; i++){
               tab[i]=(n+2)+i;
             }
         }else{
             for(i=0; i<n; i=i+2){
               tab[i]=(n+1)+i;
             }
        }
       
         for(i=0; i<n; i=i+2){
            System.out.print( tab[i]+ "\t");
        }
        
   
    }
    
}
