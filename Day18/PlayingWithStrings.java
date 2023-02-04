/*problem : https://www.codechef.com/problems/PLAYSTR*/
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
            int arr[] = new int[a];
            int sum1=0;
            int sum2=0;
            String s = sc.next();
            String r = sc.next();
            for(int i=0;i<a;i++){
                if(s.charAt(i)=='1') sum1++;
                if(r.charAt(i)=='1') sum2++;
            }
            if(sum1==sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
		    
		}
	}
}
