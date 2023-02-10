/*problem : https://www.codechef.com/problems/HAPPYSTR*/
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
		    String s = sc.next();
		    int count=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		            count++;
		        }
		        else {
		            count=0;
		        }
		        if(count==3){
		            System.out.println("Happy");
		            break;
		            
		        }
		    }
		    if(count<=2) System.out.println("Sad");
		    
		}
	}
}
