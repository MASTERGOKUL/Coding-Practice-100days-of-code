/*problem : https://www.codechef.com/problems/TEKKEN?tab=statement*/
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
		    if(a>Math.abs(b-c)){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
