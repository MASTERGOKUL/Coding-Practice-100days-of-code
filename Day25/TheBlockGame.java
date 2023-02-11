/*problem : https://www.codechef.com/problems/PALL01*/
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
		    int rev=0;
		    int temp=a;
		    while(temp>0){
		        int last=temp%10;
		        rev=rev*10+last;
		        temp/=10;
		    }
		    if(rev==a){
		        System.out.println("wins");
		    }
		    else{
		        System.out.println("loses");
		    }
		    
		}
	}
}
