//problem : https://leetcode.com/problems/reverse-vowels-of-a-string/description/
class Solution {
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        String dummy="";
        for(char c:s.toCharArray())
        {
            if(str.contains(""+c))dummy+=c;
        }
        char c[]=s.toCharArray();
        int j=dummy.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(str.contains(""+s.charAt(i))){c[i]=dummy.charAt(j);j--;}
        }
		
        return String.valueOf(c);
    }
}