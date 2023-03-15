/* problem : https://www.codechef.com/START81D/problems/BOOKPAGES */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int odd=0,even=0;
	        int[] arr= new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	            if((i+1)%2==0){
	                even+=arr[i];
	            }
	            else{
	                odd+=arr[i];
	            }
	        }
	        if((even%2==0 && odd%2==0 )||(even%2==1 && odd%2==1))
	        System.out.println("Yes");
	        else{
	            System.out.println("No");
	        }
	        
	    }
	}
}