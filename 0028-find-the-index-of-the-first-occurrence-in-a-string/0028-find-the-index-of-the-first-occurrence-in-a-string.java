class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle))
        {
            //char ch = needle.charAt(0);
            return haystack.indexOf(needle);
        }
        return -1;
    }
}