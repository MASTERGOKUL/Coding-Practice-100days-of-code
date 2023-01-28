/*problem : https://www.codechef.com/problems/ARRSWAP*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int a = sc.nextInt();
		    
		    int arr[]=new int[2*a];
		    
		    for(int i=0;i<2*a;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int min_val=Integer.MAX_VALUE;
		    
		    for(int k=2*a-1;k>=a-1;k--){
		        
		        min_val=Math.min(min_val,(arr[k]-arr[k-a+1]));
		    }
		    System.out.println(min_val);
		    
		}
	}
}
