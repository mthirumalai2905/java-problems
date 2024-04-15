package Advanced;

public class KMPalgorithm {
    public static int[] computeLPSArray(String pattern){
        int[] lps = new int[pattern.length()];
        int j = 0;

        for(int i = 1; i < pattern.length(); i++){
            if(pattern.charAt(i) == pattern.charAt(j)){
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if(j != 0){
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int KMP(String text, String pattern){
        int[] lps = computeLPSArray(pattern);
        int i = 0;
        int j = 0;

        while (i < text.length()) {
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }

            if(j == pattern.length()){
                return i - j;
            } else if(i < text.length() && text.charAt(i) != pattern.charAt(j)){
                if(j != 0){
                    j = lps[j-1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        int result = KMP(text, pattern);
        if(result != -1){
            System.out.println("Pattern found at index: " +result);
        } else {
            System.out.println("Pattern not found in the text");
        }
    }
    
}
