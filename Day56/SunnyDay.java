/*problem : https://www.codechef.com/START81D/problems/SUNNYDAY*/
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
		    int num=sc.nextInt();
            System.out.println(num>24?"YES":"NO");
		}
	}
}
