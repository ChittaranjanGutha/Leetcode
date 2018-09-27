import java.util.Stack;

public class Ternary439 {
    public static void main(String[] args) {
        Ternary439 obj=new Ternary439();
        String expression="T?2:3";
        System.out.print(obj.parseTernary(expression));

    }

    public String parseTernary(String expression) {
      Stack<Character> stack=new Stack<Character>();
      for(int i=expression.length()-1;i>=0;i--)
      {
          if(!stack.isEmpty() && stack.peek()=='?')
          {
                stack.pop();
                char first=stack.pop();
                stack.pop();
                char second=stack.pop();
                if(expression.charAt(i)=='T')
                    stack.push(first);
                else
                    stack.push(second);
          }
          else
          {
              stack.push(expression.charAt(i));
          }
      }
     return String.valueOf(stack.peek());
    }
}
