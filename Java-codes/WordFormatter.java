public class WordFormatter {
    private static String formatWord(String str) {
        String[] arr = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (String s : arr) {
            if (s.length() != 0) {
                strBuilder.append(s).append(" ");
            }
        }
        str = strBuilder.toString();
        return str.substring(0, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(formatWord("   I Love   my India"));
    }
}
