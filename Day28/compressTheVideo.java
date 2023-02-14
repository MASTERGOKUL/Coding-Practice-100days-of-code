/*problem : https://www.codechef.com/problems/COMPRESSVD?tab=statement*/
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
		    for(int i=0;i<a;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=a;
		    for(int i=0;i<a-1;i++){
		        if(arr[i]==arr[i+1]){
		            count--;
		        }
		    }
		    System.out.println(count);
		}
	}
}
