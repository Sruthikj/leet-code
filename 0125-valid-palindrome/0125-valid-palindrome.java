class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String st = "";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                st += s.charAt(i);
            }
        }

        String rev = "";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev += st.charAt(i);
        }

        if(st.equals(rev))
        {
            return true;
        }
        return false;
    }
}