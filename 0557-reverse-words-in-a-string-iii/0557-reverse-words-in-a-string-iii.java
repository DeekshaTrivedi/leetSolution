public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            // reversed.reverse(); 
                       reversed.append(new StringBuilder(word).reverse()).append(" ");

        }
        return reversed.toString().trim();
    }
}