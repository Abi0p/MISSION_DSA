package patterns;

import java.util.Scanner;

public class hollow_full_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no. of rows");
        n=sc.nextInt();
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=2*n-3;j++){
                if ((i==n-1) || (i+j == 5) || (j-i==3)){
                    System.out.print("*");
                }
            else{
                System.out.print(" ");
            }

            }
            System.out.println(); 
        }
    
    }
   
}
