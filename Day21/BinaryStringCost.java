/*problem : https://www.codechef.com/problems/BSCOST*/
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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String s=sc.next();
		    int one =0;
		    int zeros =0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1') one++;
		        else zeros++;
		    }
		    if(one==n || zeros==n) System.out.println(0);
		    else{
		        System.out.println(x>y?y:x);
		    }
		    
		}
	}
}
