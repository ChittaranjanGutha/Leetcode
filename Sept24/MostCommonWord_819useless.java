import java.util.*;

public class MostCommonWord819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String res = "";
        Map<String, Integer> values = new HashMap<>();
        List<String> bannedList = new ArrayList<String>();
        for (String b : banned)
            bannedList.add(b);
        String[] words = paragraph.split(" ");
        for (int i = 0; i < words.length; i++) {
            String key = generateKey(words[i]);
            if (values.containsKey(key))
                values.put(key, values.get(key) + 1);
            else
                values.put(key, 1);
        }
        Object[] obj = values.entrySet().toArray();
        Arrays.sort(obj, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue().compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        for (Object o : obj) {
            String key = ((Map.Entry<String, Integer>) o).getKey();
            if (bannedList.contains(key))
                continue;
            else {
                res = key;
                break;
            }
        }
        return res;
    }

    public String generateKey(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 65 && ch <= 90)) {
                sb.append((char) (ch + 32));
            } else if (ch >= 97 && ch <= 122) {
                sb.append(ch);
            } else
                continue;
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        MostCommonWord819 obj = new MostCommonWord819();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        System.out.print(obj.mostCommonWord(paragraph, banned));

    }

}
