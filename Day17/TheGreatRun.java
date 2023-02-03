/*problem : https://www.codechef.com/problems/PROC18A*/
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
		    int arr[] = new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=sc.nextInt();
		    }
		    int greater=0;
		    for(int i=0;i<a-(b-1);i++){
		        int sum=0;
		        for(int j=0;j<b;j++){
		            sum+=arr[i+j];
		        }
		        if(sum>greater) greater=sum;
		    }
		    System.out.println(greater);
		    
		}
	}
}
