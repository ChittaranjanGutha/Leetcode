import java.util.ArrayList;
import java.util.List;

public class Segements434 {
    public static void main(String[] args) {
        Segements434 obj = new Segements434();
        System.out.print(obj.countSegments("a                "));

    }

    public int countSegments(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ')
                result++;
        }
        return result;
    }
}
