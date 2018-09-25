import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == '+' && str[i + 1] == '+') {
                char[] temp = s.toCharArray();
                temp[i] = '-';
                temp[i + 1] = '-';
                result.add(String.valueOf(temp));
            }
        }
        return result;
    }

    public static void main(String args[]) {
        FlipGame obj = new FlipGame();
        String str = "++++";
        System.out.print(obj.generatePossibleNextMoves(str));
    }
}
