/*

Problem
Chef is playing a mobile game. In the game, Chef's character Chefario can perform special attacks. However, one special attack costs XX mana points to Chefario.

If Chefario currently has YY mana points, determine the maximum number of special attacks he can perform.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers XX and YY — the cost of one special attack and the number of mana points Chefario has initially.
Output Format
For each test case, output the maximum number of special attacks Chefario can perform.

Constraints
1 \leq T \leq 10^51≤T≤10 
5
 
1 \le X \le 1001≤X≤100
1 \le Y \le 10001≤Y≤1000
Sample 1:
Input
Output
3
10 30
6 41
50 2
3
6
0
Explanation:
Test case 11: Chefario can perform a maximum of 33 special attacks which will cost him 3030 mana points.

Test case 22: Chefario can perform a maximum of 66 special attacks which will cost him 3636 mana points. Note that Chefario can not perform 77 special attacks as these will cost him 4242 mana points while he has only 4141 mana points.

Test case 33: Chefario will not be able to perform any special attacks in this case.

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
		    int b = s.nextInt();
		    System.out.println(b/a);
		    i++;
		}
	}
}
