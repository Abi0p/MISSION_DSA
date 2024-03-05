import java.io.*;
public class leaders_in_an_array{
    void printLeaders(int arr[],int size){
        for (int i=0;i<size;i++){
            int j;
            for ( j=i+1;j<size;j++){
                if (arr[i]<=arr[j])
                    break;
               
            }
            if(j == size)
               System.out.print(arr[i]+ " ");
        }
    }
    public static void main (String[] args){
        leaders_in_an_array lead = new leaders_in_an_array();
        int arr[]=new int[]{16,17,21,3,6,9};
        int n = arr.length;
        lead.printLeaders(arr, n );

    }

}