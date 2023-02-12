/*problem : https://www.codechef.com/problems/SIMPSTAT?tab=statement*/
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
		    int k = sc.nextInt();
		    int nums[] = new int[n];
		    for(int i=0; i<n; i++){
		        nums[i] = sc.nextInt();
		    }
		    Arrays.sort(nums);
		    if(n - 2*k <= 0){
		        System.out.println("0.000000");
		        continue;
		    }
		    double sum = 0;
		    for(int i=k; i<n-k; i++){
		        sum += nums[i];
		    }
		    double res = sum/(n - 2*k);
		    System.out.println(res);
		}
	}
}
