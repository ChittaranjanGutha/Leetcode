
public class StringCompression {
    public static void main(String[] args) {
        StringCompression obj = new StringCompression();
        char[] val = new char[]{'a'};
        System.out.print(obj.compress(val));
    }

    public int compress(char[] chars) {
        int index = 0, count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                count++;
                chars[index++] = chars[i];
                if (count == 1) {
                    count = 0;
                    continue;
                } else {
                    if (count < 10)
                        chars[index++] = (char) (count + 48);
                    else {
                        String str = String.valueOf(count);
                        for (char ch : str.toCharArray())
                            chars[index++] = ch;
                    }

                }
                count = 0;
            } else
                count++;
        }
        return index;
    }
}
