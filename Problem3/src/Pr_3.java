import java.util.HashSet;
import java.util.Set;

public class Pr_3 
{
	 public int lengthOfLongestSubstring(String s) 
	    {
	      if(s==null || s.length()<1)
	          return 0;
	          
	      int result=0;
	      for(int i=0;i<s.length();i++)
	      {
	          for(int j=i+1;j<s.length();j++)
	          {
	              if(checkRepated(s.substring(i,j)))
	                  result=Math.max(j-i,result);
	          }
	      }
	        return result;
	    }
	    public boolean checkRepated(String s)
	    {
	        Set<Character> values= new HashSet<Character>();
	        for(int i=0;i<s.length();i++)
	        {
	            if(values.contains(s.charAt(i)))
	                return false;
	            values.add(s.charAt(i));
	        }
	        return true;
	    }
	    public static void main(String args[])
	    {
	    	String s="abcd";
	    	Pr_3 obj= new Pr_3();
	    	System.out.println(obj.lengthOfLongestSubstring(s));
	    }
}
