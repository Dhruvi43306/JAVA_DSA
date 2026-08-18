public class P1 { 
    public static void findSecrateWord(String word, String[] sentences) { 
        for (int i = 0; i < sentences.length; i++) { 
            for (int j = i; j <= i; j++) { 
                char[] words = sentences[j].toCharArray();
                int k = 0;
                String result = "";
                
                while(k < words.length){
                    if(words[k] != ' '){
                        result += words[k];
                    }
                    else{
                        if(result.equals(word) && result.length() == word.length()){
                             System.out.println(result + j);
                        }
                        result = "";
                    }
                k++;
                }
                 if(result.equals(word) && result.length() == word.length()){
                    System.out.println(result);
                }
            } 
        } 
    } 

    public static void main(String[] args) { 
        String SecretWord = "cat"; 
        String[] Sentences = { 
            "I love my pet", 
            "A car ran fast", 
            "He bought a hat", 
            "The cat sat on the mat"
        }; 
        
        findSecrateWord(SecretWord, Sentences); 
    } 
}