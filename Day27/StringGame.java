/*problem : https://www.codechef.com/problems/ABSTRING?tab=statement*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String str=sc.next();
		    boolean ans=true;
		    int [] a=new int[26];
		    for(int i=0;i<n;i++)
		    {
		        a[str.charAt(i)-97]++;
		    }
		    for(int i=0;i<26;i++)
		    {
		        if(a[i]%2!=0)
		        ans=false;
		    }
		    if(ans)
		    {
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		}
	}
}
