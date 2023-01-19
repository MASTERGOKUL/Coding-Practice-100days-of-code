
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int small_ab=a<b?a:b;
		    int large_ab=a>b?a:b;
		    int x=0;
		    for(int j=1;j<=small_ab;j++){
		        if(a%j==0 && b%j==0)
		        x=j;
		    }
		    int lcm_ax=1;
		    int gcd_bx=1;
		    int lar_ax=a>x?a:x;
		    int small_bx=b<x?b:x;
		    for(int j=lar_ax;j<=a*x;j=j+lar_ax){
		        if(j%a==0 && j%x==0){
		            lcm_ax=j;
		            break;
		        }
		    }
		    for(int j=1;j<=small_bx;j++){
		        if(b%j==0 && x%j==0){
		            gcd_bx=j;
		        }
		    }
		    System.out.println(lcm_ax-gcd_bx);
		    
		    i++;
		}
	}
}
