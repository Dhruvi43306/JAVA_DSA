public class P4 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        int[] freq = new int[26];

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int j = 0; j < freq.length; j++) {
            if (freq[j] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}