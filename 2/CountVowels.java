public class CountVowels {
    
    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
}
    public static void main(String[] args) {
        
        String s = args[0];
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)){
                vowelCount++;
            }
        }
        System.out.println(" number of vowels :" + vowelCount );
    }
    
}