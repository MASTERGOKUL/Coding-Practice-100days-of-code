//problem : https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
        char sch []=s.toCharArray();
        char tch []=t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        s=new String(sch);
        t=new String(tch);
        System.out.println(s+" "+t);
        return s.equals(t);
    }
}