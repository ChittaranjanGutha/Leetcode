class Solution {
  public int calPoints(String[] ops) {
        int result=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(String str: ops)
        {
            if(str.equals("+"))
            {
              int top1=stack.pop();
              int top2=stack.pop();
              int res=top1+top2;
              stack.push(top2);
              stack.push(top1);
              stack.push(res);
            }
            else if(str.equals("C")){
                int top1=stack.pop();
            }
            else if(str.equals("D")){
                int top1=stack.peek();
                stack.push(2*top1);
            }
            else
            {
                int val=Integer.parseInt(str);
                stack.push(val);
            }
            System.out.println(stack);
        }
        for(int res: stack)
            result+=res;
        return result;
    }
}
