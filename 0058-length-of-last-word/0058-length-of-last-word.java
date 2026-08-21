class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] ss = s.split(" ");

        int last = ss.length-1;

        String l = ss[last];
        
        return l.length();
    }
}