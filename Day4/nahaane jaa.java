/*

https://www.codechef.com/problems/EQSARRAY

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
		    int count=0;
		    int temp;
		    for (int i=1; i<a; i++){
		        temp=sc.nextInt();
		        if(temp==b)
		        count++;
		    }
		    temp=sc.nextInt();
            if(a==1&&temp==b) count++;
		    if(count>0)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		    
		}
	}
}
