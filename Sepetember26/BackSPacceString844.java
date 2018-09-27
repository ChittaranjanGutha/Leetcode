import java.util.Stack;

public class BackSPacceString844 {
    public static void main(String args[]) {
        BackSPacceString844 obj = new BackSPacceString844();
        String S = "y#fo##f";
        String T = "y#f#o##f";
        System.out.println(obj.backspaceCompare(S, T));
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<Character>();
        Stack<Character> t = new Stack<Character>();
        for (char ch : S.toCharArray()) {
            if (ch != '#')
                s.push(ch);
            else if (!s.isEmpty())
                s.pop();
        }
        for (char ch : T.toCharArray()) {
            if (ch != '#')
                t.push(ch);
            else if (!t.isEmpty())
                t.pop();
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        for (char ch : s)
            sb.append(ch);
        for (char ch : t)
            tb.append(ch);
        if (sb.toString().equals(tb.toString()))
            return true;
        return false;
    }
}
