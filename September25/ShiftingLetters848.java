public class ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int shift : shifts)
            index = (shift + index) % 26;
        for (int i = 0; i < S.length(); i++) {
            int val = S.charAt(i) - 'a';
            sb.append((char) ((val + index) % 26 + 'a'));
            index = Math.floorMod(index - shifts[i], 26);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        ShiftingLetters obj = new ShiftingLetters();
        String S = "abc";
        int[] shifts = new int[]{30, 56, 97};
        System.out.print(obj.shiftingLetters(S, shifts));

    }
}
