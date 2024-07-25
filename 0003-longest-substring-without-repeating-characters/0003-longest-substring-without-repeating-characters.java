class Solution {
    public int lengthOfLongestSubstring(String s) {
       int size = 0;
       boolean rep=false;
       StringBuilder str=new StringBuilder();

       for(int i=0;i<s.length();i++)
       {
          str.append(s.charAt(i));

          for(int j=i+1;j<s.length();j++)
          {
             for(int k=0;k<str.length();k++)
             {
                if(s.charAt(j)==str.charAt(k))
                {
                    rep=true;
                    break;
                }
             }
             if(!rep)
             {
                str.append(s.charAt(j));
             }
             else
             {
                break;
             }
          }
            if(str.length()>size)
            {
                size=str.length();
            }
            rep=false;
            str=new StringBuilder();
       }
       return size;
    }
}