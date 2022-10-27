public class TotalWordsInString {
    private static int totalWords(String str) {
        int count = 0;
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (s.length() != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(totalWords("   I Love   my India"));
    }
}
