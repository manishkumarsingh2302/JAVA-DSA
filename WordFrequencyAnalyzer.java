import java.util.*;

public class WordFrequencyAnalyzer {

    public static void analyzeText(String text) {
        // Step 1: Normalize text
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Step 2: Split text into words
        String[] words = text.split("\\s+");

        // Step 3: Count word frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 4: Convert map to list for sorting
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());

        // Step 5: Sort by frequency (descending)
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 6: Print results
        System.out.println("Word Frequencies (sorted):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String paragraph = "Java is a powerful programming language. Java is used in web, mobile, and desktop apps. Java is everywhere!";
        analyzeText(paragraph);
    }
}
