import java.util.Scanner;

public class ReperatedString686 {
    public static void main(String[] args) {
        ReperatedString686 obj = new ReperatedString686();
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.print(obj.repeatedStringMatch(A,B));
    }

    public int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb=new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.indexOf(B)>=0)
            return count;
        else if(sb.append(A).indexOf(B)>=0)
            return  count+1;
        return -1;
    }
}
