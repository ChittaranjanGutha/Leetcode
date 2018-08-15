import java.util.ArrayList;

class Solution {
	public String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		ArrayList<String> values = new ArrayList<String>();
		StringBuilder sc = new StringBuilder();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') {
				values.add(sc.toString());
				sc.setLength(0);
			} else {
				sc.append(s.charAt(i));
			}
		}
		values.add(sc.toString());

		// Reverse every element in the ArrayList;
		for (int i = 0; i < values.size(); i++) {
			char[] ch = values.get(i).toCharArray();
			int ln = ch.length;
			for (int index = 0; index < ln / 2; index++) {
				char temp = ch[ln - index - 1];
				ch[ln - index - 1] = ch[index];
				ch[index] = temp;
			}
			result.append(new String(ch));
			result.append(" ");
		}
		return result.toString().trim();
	}
}

//Approach2
class Solution {
    public String reverseWords(String s) 
    {
     StringBuilder result= new StringBuilder();
      String[] values=s.split(" ");
      for(int i=0;i<values.length;i++)
      {
          StringBuilder sc= new StringBuilder(values[i]);
          sc.reverse();
          result.append(sc);
          result.append(" ");
      }
      return result.toString().trim();
    }
}
