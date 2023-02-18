/* problems : https://www.codechef.com/problems/REC_05?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    LinkedList<Integer> list=new LinkedList<Integer>();
		    int j=sc.nextInt();
		    int count=0;
		    while(j!=-1)
		    {
		        list.add(j);
		        count++;
		        j=sc.nextInt();
		    }
		    int n=sc.nextInt();
		    int k=count-n;
		    
    		while(k<count){
    		    System.out.print(list.get(k)+" ");
    		    k++;
    		}
    		int a=0;
    		while(a<count-n){
    		    System.out.print(list.get(a)+" ");
    		    a++;
    		}
		    
    		System.out.println();
		}
	}
}