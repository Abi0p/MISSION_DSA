package patterns;

import java.util.Scanner;

public class Full_pyramid {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no. of rows");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            
            
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
    
5