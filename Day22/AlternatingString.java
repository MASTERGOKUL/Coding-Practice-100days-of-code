/*problem :https://www.codechef.com/problems/ALTSTR */
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
		    String s = sc.next();
		    int zeros=0;
		    int ones=0;
		    for(int i=0;i<a;i++){
		        if(s.charAt(i)=='1'){
		            ones++;
		        }
		        else{
		            zeros++;
		        }
		    }
		    if(zeros ==ones) System.out.println(2*zeros);
		    else if(zeros>ones){
		        System.out.println(2*ones+1);
		    }
		    else System.out.println(2*zeros+1);
		    
		}
	}
}
