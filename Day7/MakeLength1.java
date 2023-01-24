
import java.util.*;
import java.lang.*;
import java.io.*;

/*problem : https://www.codechef.com/problems/MAKELENGTH1*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase-- > 0){
		    int a = sc.nextInt();
		    String s=sc.next();
		    boolean flag=false;
		    for(int i=0;i<a;i++){
		        if(s.charAt(i)=='1'){
		            if(i==a-1 || s.charAt(i+1)!='1'){
		                flag=true;
		                break;
		            }
		            else i++;
		        }
		    }
		    if(a==1 || !flag){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
