/*problem : https://www.codechef.com/problems/SNAKPROC*/
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
		    int n = sc.nextInt();
		    String s = sc.next();
		    s=s.replace(".","");
		    s=s.replace("HT","");
		    if(s=="") System.out.println("Valid");
		    else System.out.println("Invalid");
		}
	}
}