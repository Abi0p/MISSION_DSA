package patterns;

import java.util.*;
public class inverted_right_half_pyramid{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();           
        }
    }
}