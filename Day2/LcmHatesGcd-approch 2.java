
import java.util.*;
import java.lang.*;
/*

Problem
Chef has two integers 
�
A and 
�
B.
Chef wants to find the minimum value of 
lcm
(
�
,
�
)
−
gcd
(
�
,
�
)
lcm(A,X)−gcd(B,X) where 
�
X is any positive integer.

Help him determine this value.

Note: 
gcd
(
�
,
�
)
gcd(P,Q) denotes the greatest common divisor of 
�
P and 
�
Q and 
lcm
(
�
,
�
)
lcm(P,Q) denotes the least common multiple of 
�
P and 
�
Q.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers 
�
A and 
�
B — the integers mentioned in the statement.
Output Format
For each test case, output the minimum value of 
lcm
(
�
,
�
)
−
gcd
(
�
,
�
)
lcm(A,X)−gcd(B,X).

Constraints
1
≤
�
≤
1
0
5
1≤T≤10 
5
 
1
≤
�
,
�
≤
1
0
9
1≤A,B≤10 
9
 
Sample 1:
Input
Output
3
12 15
5 50
9 11
9
0
8
Explanation:
Test case 
1
1: For 
�
=
6
X=6: 
lcm
(
12
,
6
)
−
gcd
(
15
,
6
)
=
12
−
3
=
9
lcm(12,6)−gcd(15,6)=12−3=9 which is the minimum value required.

Test case 
2
2: For 
�
=
50
X=50: 
lcm
(
5
,
50
)
−
gcd
(
50
,
50
)
=
50
−
50
=
0
lcm(5,50)−gcd(50,50)=50−50=0 which is the minimum value required.

Test case 
3
3: For 
�
=
1
X=1: 
lcm
(
9
,
1
)
−
gcd
(
11
,
1
)
=
9
−
1
=
8
lcm(9,1)−gcd(11,1)=9−1=8 which is the minimum value required.



*/


import java.io.*;
import java.math.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n){
		    BigInteger a = new BigInteger(s.nextInt()+"");
		    BigInteger b = new BigInteger(s.nextInt()+"");
		    BigInteger x=a.gcd(b);
		    BigInteger output=( ((a.multiply(x)).divide(a.gcd(x))).subtract(b.gcd(x)) );
		    System.out.println(output);
		    i++;
		}
	}
}
