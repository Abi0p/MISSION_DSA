package patterns;

import java.util.Scanner;

public class hourglass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no. of rows");
        n=sc.nextInt();
        for (int i=1;i<n;i++){
            System.out.print(" ");
            for (int j=1;j< i;j++){
                System.out.print(" ");
            
            
            }
            for (int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        for (int i=1;i<=n;i++){
            for (int j=n-1;j>=i-1;j--){
                System.out.print(" ");
            
            
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }

    }
    
}
