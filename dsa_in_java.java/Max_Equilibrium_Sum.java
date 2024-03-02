import java.io.*;
class Maximum_Equilibrium_Sum {
	static int  findMaxsum(int []arr,int  n){
		int res = Integer.MIN_VALUE;
		for (int i=0; i<n;i++){
			int prefix_sum = arr[i];
			for (int j=0;j<i;j++)
				prefix_sum += arr[j];

			
			int suffix_sum = arr[i];
			for (int j=n-1;j>i;j--)
				suffix_sum += arr[j];
			
			if (prefix_sum == suffix_sum)
				res = Math.max(res,prefix_sum);
			   
			    

		}
	     return res ;

	}
	public static void main (String args ){
		int arr[] = {2,5,-6,8,-5,-9,4,2};
		int n = arr.length;
		System.out.println(findMaxsum(arr,n));
	}
}
