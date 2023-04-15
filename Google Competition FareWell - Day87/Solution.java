import java.util.*;
public class Solution{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int temper=t;
        while(t-->0){
            int n=sc.nextInt();
            int color[]=new int[n];
            for(int i=0;i<n;i++){
                color[i]=sc.nextInt();
            }
            
            HashMap<Integer,Integer> key = new HashMap<>();
            int num=1;
            for(int i=0;i<n;i++){
                if(!key.containsKey(color[i]))
                key.put(color[i],num);
                num++;
            }
            int ans[]=new int[n];
            for(int i=0;i<n;i++){
                ans[i]=key.get(color[i]);
            }
            boolean flag=false;
            for(int i=0;i<n-1;i++){
                if(ans[i]>ans[i+1]){
                    // System.out.println(ans[i]+" "+ans[i+1]);
                    System.out.println("Case #"+(temper-t)+" IMPOSSIBLE");
                    flag=true;
                    break;
                }
            }
            if(flag) continue;
            System.out.print("Case #"+(temper-t));
            int i=0;
            for(;i<n-1;i++){
                if(color[i]==color[i+1]) continue;
                System.out.print(" "+color[i]);
            }
            System.out.print(" "+color[i]);
            System.out.println();
            
        }
    }
}