public class Palindrome {
    
    public static void main(String[] args) {
        String phrase = "A man, a plan, a canal, Panama";
        boolean isP = isP(phrase);
        System.out.println("Is the phrase a palindrome? " + isP);
    }

    public static boolean isP(String phrase) {
       
        String n = normalize(phrase);
       System.out.println(n);
       
        return isPs(n);
    }

    private static String normalize(String phrase) {
       
        return phrase.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }

    private static boolean isPs(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
