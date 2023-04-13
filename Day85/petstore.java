/*problem : https://www.codechef.com/problems/PETSTORE?tab=statement*/
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt(); 
      int[] a = new int[n]; 

      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      java.util.Arrays.sort(a);

      int[] counts = new int[101];
      for (int i = 0; i < n; i++) {
        counts[a[i]]++;
      }

      boolean possible = true;
      for (int i = 0; i <= 100; i++) {
        if (counts[i] % 2 == 1) {
          possible = false;
          break;
        }
      }

      if (possible) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}S