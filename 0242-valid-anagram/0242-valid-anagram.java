class Solution {
    public boolean isAnagram(String s, String t) {
        boolean anagram=false;
        String s1,s2;
        char arr[]=s.toCharArray(),arr2[]=t.toCharArray();
        if(s.length()==t.length())
        {
           Arrays.sort(arr);
           s1=new String(arr);
           Arrays.sort(arr2);
           s2=new String(arr2);
           if(s1.contains(s2))
           {
             anagram=true;
           }
        }
        else
        {
            return false;
        }
        return anagram;
    }
}