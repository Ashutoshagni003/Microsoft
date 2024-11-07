package String;

import java.util.*;

public class Leet451 {
    public static void main(String[] args) {
        System.out.println(frequencySort("raaeaedere"));
    }
    public static String frequencySort(String s) {
        int[] freq = new int[128]; // ASCII character set

        // Count frequency of each character in the string
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Create a list of characters and sort based on frequency
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                chars.add((char) i);
            }
        }

        // Sort characters by frequency in descending order
        Collections.sort(chars, (a, b) -> freq[b] - freq[a]);

        // Build the result string
        StringBuilder res = new StringBuilder();
        for (char ch : chars) {
            for (int i = 0; i < freq[ch]; i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}
