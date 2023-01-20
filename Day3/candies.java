/*

https://www.codechef.com/problems/CNDY

*/
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
		    int arr[] = new int[2*a];
		    for(int i=0;i<2*a;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    boolean flag=true;
		    for(int i=0;i<(2*a)-1;i++){
		        count=0;
		        for(int j=i;j<2*a;j++){
		            if(arr[j]==arr[i]){
		                count++;
		            }
		             if(count==3){
		            flag=false;
		            break;
		        }
		       }
		       
		    }
		        System.out.println(flag?"yes":"no");
		   
		}
	}
}
