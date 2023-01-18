/*

Problem
Chef had an array AA of length NN such that 1 \le A_i \le N1≤A 
i
​
 ≤N for all 1 \le i \le N1≤i≤N. Chef constructed another binary array BB of length NN in the following manner:

B_i = 1B 
i
​
 =1 if the frequency of element ii in AA is odd.
B_i = 0B 
i
​
 =0 if the frequency of element ii in AA is even.
Such an array BB is called the parity encoding array of AA.

For example, if A = [1, 1, 2, 3]A=[1,1,2,3], then B = [0, 1, 1, 0]B=[0,1,1,0].

Unfortunately, Chef completely forgot the array AA and vaguely remembers the parity encoding array BB. He is now wondering whether there exists any valid array AA for which the parity encoding array is BB. Can you help Chef?

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer NN — the size of the arrays AA and BB.
The second line of each test case contains NN space-separated integers B_1, B_2, \dots, B_NB 
1
​
 ,B 
2
​
 ,…,B 
N
​
  denoting the parity encoding array BB.
Output Format
For each test case, output YES if there exists any valid array AA for which the parity encoding array is BB. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1 \leq T \leq 10^51≤T≤10 
5
 
1 \leq N \leq 10^51≤N≤10 
5
 
B_i \in \{0, 1\}B 
i
​
 ∈{0,1}
Sum of NN over all test cases does not exceed 2 \cdot 10^52⋅10 
5
 .
Sample 1:
Input
Output
3
4
0 1 0 1
5
1 1 1 1 0
6
1 1 1 1 1 1
YES
NO
YES
Explanation:
Test case 11: A = [2, 4, 3, 3]A=[2,4,3,3] is a valid array for the given array BB.

Test case 22: It can be proven that there does not exist any array AA for the given parity encoding array BB.

Test case 33: A = [1, 2, 3, 4, 5, 6]A=[1,2,3,4,5,6] is a valid array for the given array BB.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
		    int a = s.nextInt();
		    int c=0;
		    for(int j=0;j<a;j++){
		        int arr=s.nextInt();
		        if(arr==0){
		            c++;
		        }
		    }
		    System.out.println((c&1)==0?"yes":"no");
		    i++;
		}
	}
}
