// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class P4 {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        String[] strs = {"flow", "flight", "flower"};
        int min = 0;
       for(int i = 0;i < strs.length-1; i++){
            char[] first = strs[i].toCharArray();
            char[] second = strs[i + 1].toCharArray();
            if(first.length > second.length){
                min = second.length;
            }
            else{
                min = first.length;
            }
            for(int j = 0; j < min; j++){
          
                if(first[j] > second[j]){
                    String temp = strs[i];
                    strs[i] = strs[i+1];
                    strs[i+1] = temp;
                    break;
                }
            } 
            
               
            
       }
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}