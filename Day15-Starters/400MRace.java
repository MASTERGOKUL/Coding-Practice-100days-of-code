/*problem : https://www.codechef.com/START76D/problems/RACE400M*/
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
		    if(a<b && a<c){
		       System.out.println("ALICE");
		    }
		    else if(b<a && b<c){
		       System.out.println("BOB");
		    }
		    else if(c<a && c<b) {
		       System.out.println("CHARLIE");
		    }
		    
		}
	}
}
