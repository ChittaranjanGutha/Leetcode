import java.util.HashSet;
import java.util.Set;

//SLiding Window Problem
public class Pr_3_Model2 
{
	 public int lengthOfLongestSubstring(String s) 
	    {
	      Set<Character > values= new HashSet<Character>();
	      int ans=0,i=0,j=0;
	      while(i<s.length() && j<s.length())
	      {
	    	  //If the element is not present in the set
	          if(!values.contains(s.charAt(j)))
	          {
	              values.add(s.charAt(j++));
	              //Compare the previous max sub string with current
	              ans=Math.max(ans,j-i);
	          }
	          else
	        	  //If the element is already present remove from the set
	              values.remove(s.charAt(i++));
	      }
	    return ans;
	    }
	 
	 public static void main(String args[])
	 {
	   String s="bbbbb";
	   Pr_3_Model2 obj= new Pr_3_Model2();
	   System.out.println(obj.lengthOfLongestSubstring(s));
	 }
}
