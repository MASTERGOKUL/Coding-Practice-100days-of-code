/*

question : https://leetcode.com/problems/regular-expression-matching/description/
reference : https://leetcode.com/problems/regular-expression-matching/solutions/191830/java-dp-solution-beats-100-with-explanation/

 */
class Solution {
    public boolean isMatch(String s, String p) {
        if (p == null || p.length() == 0) return (s == null || s.length() == 0);
        boolean b[][] = new boolean[s.length()+1][p.length()+1];
        b[0][0]=true;
        for(int j=2;j<=p.length();j++){
        b[0][j]=p.charAt(j-1)=='*' && b[0][j-2];
        }
          
        for (int j=1; j<=p.length(); j++) {
            for (int i=1; i<=s.length(); i++) {
                if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.') 
					b[i][j] = b[i-1][j-1];
                else if(p.charAt(j-1) == '*')
                    b[i][j] = b[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && b[i-1][j]); 
            }
        }
        return b[s.length()][p.length()];
        // </> SIMPLE ANSWER </>
        // return s.matches("^" + p + "$");
    }
}