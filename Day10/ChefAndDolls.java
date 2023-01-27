
import java.util.*;
import java.lang.*;
import java.io.*;

/* problem : https://www.codechef.com/problems/MISSP*/

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int j=1;
		while(j<=t){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i =0; i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    Arrays.sort(arr);
		    int i=0;
		    for(i=0;i<n-1;i+=2){
		        if(arr[i]!=arr[i+1]){
		            break;
		        }
		    }
		      System.out.println(arr[i]);
		    j++;
		}
	}
}
