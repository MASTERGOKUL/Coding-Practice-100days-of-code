/*problem : https://www.codechef.com/problems/ZOOZ*/
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
		    String s="0";
		    for(int i=0;i<a-2;i++){
		        s+="1";
		    }
		    s+="0";
		    System.out.println(s);
		}
	}
}
