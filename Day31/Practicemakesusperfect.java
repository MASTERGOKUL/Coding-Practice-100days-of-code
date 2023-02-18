/*problem : https://www.codechef.com/problems/PRACTICEPERF*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int count=0;
		    if(a>=10) count++;
		    if(b>=10) count++;
		    if(c>=10) count++;
		    if(d>=10) count++;
		    System.out.println(count);

	}
}
