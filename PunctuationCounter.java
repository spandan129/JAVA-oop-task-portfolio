import java.util.HashMap;

public class PunctuationCounter {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        HashMap<Character, Integer> punctuationCounts = new HashMap<>();

        // Loop through each character in the text
        for (char c : text.toCharArray()) {
            // Check if the character is a punctuation mark
            if (isPunctuation(c)) {
                // Update the count of this punctuation mark
                punctuationCounts.put(c, punctuationCounts.getOrDefault(c, 0) + 1);
            }
        }

        // Print the table of punctuation marks and their counts
        System.out.println("Punctuation Marks Counts:");
        System.out.println("-------------------------");
        for (char punctuation : punctuationCounts.keySet()) {
            System.out.println(punctuation + ": " + punctuationCounts.get(punctuation));
        }
    }

    // Function to check if a character is a punctuation mark
    private static boolean isPunctuation(char c) {
        return !"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".contains(String.valueOf(c));
    }
}
