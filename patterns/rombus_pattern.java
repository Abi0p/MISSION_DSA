package patterns ;
import java.util.*;
  public class rombus_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no. of rows");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            
            
            }
            for (int k=n;k>=1;k--){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
