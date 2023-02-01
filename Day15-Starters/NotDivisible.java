/*problem : https://www.codechef.com/START76D/problems/NOTDIVISIBLE*/
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
		    int i=0;
		    for(i =0;i<a;i++){
		        if(i%2==0)
		        System.out.print(1+" ");
		        else
		        System.out.print(2+" ");
		    }
		}
	}
}
