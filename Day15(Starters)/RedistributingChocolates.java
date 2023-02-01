/*problem : https://www.codechef.com/START76D/problems/REDSTRBTN*/
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
		    int c=sc.nextInt();
		    if(a!=b && b!=c && a!=c){
		        System.out.println("yes");
		    }
		    else{
		        if(a+b+c >= 6)
		        System.out.println("yes");
		        else{
		            System.out.println("no");
		        }
		    }
		}
	}
}
