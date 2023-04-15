import java.util.*;
public class Solution{
    public static String key(String str,int alpha[]){
        String temp="";
        for(int i=0;i<str.length();i++){
            temp+=alpha[str.charAt(i)-'A'];
        }
        return temp;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int temp=t;
        while(t-->0){
            int alpha[] = new int[26];
            for(int i=0;i<26;i++){
                alpha[i]=sc.nextInt();
            }
            int n=sc.nextInt();
            String arr[]=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.next();
            }
            HashMap<String,String> str = new HashMap<>();
            for(int i=0;i<n;i++){
                str.put(arr[i],key(arr[i],alpha));
            }
            List<String> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(str.get(arr[i]));
            }
            Set<String> check = new HashSet<>(ans);
            if(check.size()<ans.size()){
                System.out.println("Case #"+(temp-t)+": YES");
            }
            else{
                System.out.println("Case #"+(temp-t)+": NO");
            }
        }
    }
}