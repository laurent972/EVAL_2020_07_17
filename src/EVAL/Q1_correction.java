
package EVAL;

import java.util.Scanner;


public class Q1_correction {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         
         System.out.print("Saisissez la valauer de n: ");
         int n=reader.nextInt();
         if(n%2!=0){ // si n est impair
             n++; //incremente +1 à n
         }
         // je fais demarrer n à un nombre pair 
         
         for(int i=n; i<n+10; i=i+2){
             System.out.print(i+"\t");
         }
    }
    
}
