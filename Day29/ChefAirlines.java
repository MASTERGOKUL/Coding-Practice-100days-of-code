/*problem :https://www.codechef.com/START77D/problems/AIRLINES */
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
		    a=a*10;
		    if(a>=b)  System.out.println(b*c);
		    else System.out.println(a*c);
		    
		}
	}
}
