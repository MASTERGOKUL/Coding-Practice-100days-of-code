/*problem : https://www.codechef.com/problems/MAKEARRAYODD*/
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
		    int b = sc.nextInt();
		    int arr[] = new int[a];
		    int even_count=0;
		    for(int i=0;i<a;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]%2==0) even_count++;
		    }
		    if(even_count==0){
		        System.out.println(0);
		    }
		    else if(even_count==a && b%2==0){
		        System.out.println(-1);
		    }
		    else{
		        if(b%2==1)
		        System.out.println((even_count%2)+even_count/2);
		        else
		        System.out.println(even_count);
		    }
		    
		}
	}
}
