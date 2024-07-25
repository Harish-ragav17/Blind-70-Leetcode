class Solution {
    public boolean isValid(String s) {
        char c[]=s.toCharArray();
        boolean same=false;
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           if(s1.isEmpty())
            {
                s1.push(c[i]);
            }
            else if(c[i]=='{' || c[i]=='[' || c[i]=='(' )
            {
               s1.push(c[i]);
            }
            else
            {
                 if(check(c[i],s1))
                 {
                     s1.pop();
                 }
                 else
                 {
                     return false;
                 }
            }
        }
        if(s1.isEmpty())
        {   System.out.print(s1);
             same=true;
        }
        return same;
    }
    public boolean check (char c, Stack<Character> k)
    {
          if(c=='}' && k.peek()=='{')
          {
              return true;
          }
          else if((c==')' && k.peek() =='('))
          { 
              return true;
          }
           else if(c==']' && k.peek()=='[')
          {
              return true;
          }
          return false;
    }
}