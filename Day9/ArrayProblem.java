/*problem : https://www.codechef.com/problems/ARRPROB*/
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
		    int arr[] = new int[a];
		    long sum1=0;
		    for(int i = 0; i < a; i ++ ){
		        arr[i]=sc.nextInt();
		        sum1+=arr[i];
		    }
		    StringBuilder sb = new StringBuilder();
		    for(int i =0;i<a;i++){
		        sb.append(sum1-arr[i]+" ");
		    }
		    System.out.println(sb);
		    
		}
	}
}
