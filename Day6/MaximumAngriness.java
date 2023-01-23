/*

https://www.codechef.com/problems/MAXAGRY

*/
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
		    long n = sc.nextInt();
		    long k = sc.nextInt();
		    if(n==1){
		        System.out.println(0);
		    }
		    else if(k>=n/2){
		        System.out.println((n*(n-1))/2);
		    }
		    else{
	        long i=n-(2*k);
		        System.out.println(n*(n-1)/2-i*(i-1)/2);
		    }
		    
		}
	}
}
