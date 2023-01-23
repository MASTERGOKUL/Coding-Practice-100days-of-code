
/*

https://www.codechef.com/problems/SLOWSOLN

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(c/b>=a){
		        System.out.println(a*b*b);
		    }
		    else{
		        int q=c/b;
		        int r=c%b;
		        System.out.println(q*b*b + r*r);}
		    
		}
	}
}
