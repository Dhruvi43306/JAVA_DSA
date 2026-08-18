public class P2 {

    public static void calculateSimilarity(String word, String[] sentences) {

        int[] similarity = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {

            char[] sentence = sentences[i].toCharArray();
            char[] secret = word.toLowerCase().toCharArray();

            int j = 0;
            String result = "";
            
            while (j < sentence.length) {
                if (sentence[j] != ' ') {
                    result += sentence[j];
                } 
                else {
                    int count = checkWord(result, secret);
                    similarity[i] += count;
                    result = "";
                }

                j++;
            }

            
            if (result.length() > 0) {
                int count = checkWord(result, secret);
                similarity[i] += count;
            }
        }

        for (int i = 0; i < similarity.length - 1; i++) {

            for (int j = 0; j < similarity.length - i - 1; j++) {

                if (similarity[j] < similarity[j + 1]) {
                    int temp = similarity[j];
                    similarity[j] = similarity[j + 1];
                    similarity[j + 1] = temp;

                    // Swap sentence
                    String tempSentence = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = tempSentence;
                }
            }
        }
        System.out.println("\nRanking:");

        for (int i = 0; i < sentences.length; i++) {
            System.out.println(
                (i + 1) + ". " + sentences[i] +
                " = " + similarity[i]
            );
        }
        System.out.println("\nFinal decoded string:");

        for (int i = 0; i < sentences.length; i++) {
            System.out.print(sentences[i]);

            if (i < sentences.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static int checkWord(String currentWord, char[] secret) {
        currentWord = currentWord.toLowerCase();
        char[] current = currentWord.toCharArray();
        if (current.length != secret.length) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < secret.length; i++) {
            if (current[i] == secret[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String secretWord = "cat";

        String[] sentences = {
            "I love my pet",
            "A car ran fast",
            "He bought a hat",
            "The cat sat on the mat"
        };

        calculateSimilarity(secretWord, sentences);
    }
}