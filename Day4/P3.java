public class P3 {
    public static void main(String[] args) {
        String str = "AAB";

        int ans = 0;

        for (int i = 0; i < str.length(); i++){
            
            int[] freq = new int[26];

            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch - 'A']++;

                int max_count = 0;
                int min_count = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        if (max_count < freq[k]) {
                            max_count = freq[k];
                        }
                        if (min_count > freq[k]) {
                            min_count = freq[k];
                        }
                    }

                }
                ans = max_count - min_count;

                if (ans <= 1)
                    System.out.println(str.substring(i, j + 1));
            }
        }

    }
}
