/* problem : https://www.codechef.com/START76D/problems/ZEROSTRING*/
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
		    String s = sc.next();
		    int zero_count =0;
		    int one_count=0;
		    for(int i=0;i<a;i++){
		        if(s.charAt(i)=='0'){
		            zero_count++;
		        }
		        else if(s.charAt(i)=='1'){
		            one_count++;
		        }
		    }
		    if(zero_count==a){
		        System.out.println(0);
		    }
		    else if(one_count==a){
		        System.out.println(1);
		    }
		    else{
		        if(zero_count<one_count){
		            System.out.println(zero_count+1);
		        }
		        else{
		            System.out.println(one_count);
		        }
		    }
		}
	}
}
