/*problem : https://www.codechef.com/problems/CONCATPAL?tab=statement*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while (testCase-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            String w = sc.next();

            int[] p = new int[128];
            if (m > n) {
                int temp = n;
                n = m;
                m = temp;
                String temps = s;
                s = w;
                w = temps;
            }
            for (int i = 0; i < n; i++) {
                p[s.charAt(i)]++;
            }
            for (int i = 0; i < m; i++) {
                p[w.charAt(i)]--;
            }

            boolean f = true;
            int c = 0;

            for (int i = 0; i < 128; i++) {
                if (p[i] < 0) {
                    f = false;
                    break;
                }
                if (p[i] % 2 == 0) {
                    continue;
                }
                if (c > 0) {
                    f = false;
                } else {
                    c = 1;
                }
            }

            if (f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }}
	}
}
