import java.util.*;

public class ArrayFrequencyAnalyzer {
    private static int[] numberArray;

    // Static method to find K most frequent numbers
    public static void findTopKFrequent(int K) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each number
        for (int number : numberArray) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Sort the map entries by frequency and then by number value
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> {
            if (entry2.getValue().equals(entry1.getValue())) {
                return entry2.getKey() - entry1.getKey();  // Sort by value if frequency is the same
            }
            return entry2.getValue() - entry1.getValue();  // Sort by frequency
        });

        // Output the top K numbers
        for (int i = 0; i < K; i++) {
            System.out.print(sortedEntries.get(i).getKey() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        numberArray = new int[]{3, 1, 4, 4, 5, 2, 6, 1};
        findTopKFrequent(2);  // Output: 4 1

        numberArray = new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        findTopKFrequent(4);  // Output: 5 11 7 10
    }
}
