/*problem : https://www.codechef.com/problems/CIREQ*/
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
		    int arr[]=new int[a];
		    int not=0;
		    for(int i=0;i<a;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int index[] = new int[a];
		    for(int i=0;i<a;i++){
		        for(int j=0;j<a;j++){
		            if(index[j]+1<=arr[i]){
		                index[j]++;
		                break;
		            }
		        }
		    }
		    int count=0;
		    for(int i=0;i<a;i++){
		        if(index[i]>0) count++;
		        else break;
		    }
		    System.out.println(count);
		}
	}
}
