import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(extract(str));
    }
    private static int extract(String s){
        int num=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num =num*10+(s.charAt(i)-'0');
            }
            else{
                res=num>res?num:res;
                num=0;
            }
        }
        return num>res?num:res;

    } 
}