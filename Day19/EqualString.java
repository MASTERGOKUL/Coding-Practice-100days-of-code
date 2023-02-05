/*problem : https://www.codechef.com/submit/EQUALSTRING*/
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
		    String a=sc.next();
		    String b=sc.next();
		    HashSet<Character> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        if(a.charAt(i)!=b.charAt(i)){
		            set.add(b.charAt(i));
		        }
		    }
		    System.out.println(set.size());
		}
	}
}
