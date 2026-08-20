class Solution {
    public String toLowerCase(String s) {
        
        String st = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                int n = (int)ch + 32;
                st += (char)n;
            }
            else
            {
                st += ch;
            }
        }
        return st;
    }
}