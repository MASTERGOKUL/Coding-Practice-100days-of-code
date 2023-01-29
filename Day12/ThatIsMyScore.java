/*problem : https://www.codechef.com/problems/WATSCORE*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int arr[] = new int[12];
		while(testCase-- > 0){
		    int N = sc.nextInt();
		    int sum =0;
		    Arrays.fill(arr,0);
		       while(N-- > 0){
		          int i = sc.nextInt();
		          int s = sc.nextInt();
		          if(arr[i] < s || (arr[i] == 0 && s > 0) && i != 0){
		              if(i < 9){
		              sum = sum - arr[i] + s;
		              }
		              arr[i] = s;
		          }
		      }
		      System.out.println(sum);
		}
	}
}
