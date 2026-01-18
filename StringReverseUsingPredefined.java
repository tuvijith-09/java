import java.util.Arrays;

class StringReverseUsingPredefined {
    public static void main(String[] args) {
        String s = "Java";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);   // predefined method (example usage)

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
