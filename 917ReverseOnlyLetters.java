import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
     ReverseOnlyLetters obj=new ReverseOnlyLetters();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(obj.reverseOnlyLetters(str));
    }

    public String reverseOnlyLetters(String S) {
        char[] values = S.toCharArray();
        int i = 0, j = values.length - 1;
        while (i < j) {
            while (i < values.length && !Character.isLetter(values[i])  )
                i++;
            while (j>=0 && !Character.isLetter(values[j]) )
                j--;
            if (i < j) {
                char temp = values[i];
                values[i] = values[j];
                values[j] = temp;
                i++;
                j--;
            }

        }
        return String.valueOf(values);
    }
}
