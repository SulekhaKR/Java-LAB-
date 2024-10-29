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
/*Class Variable:

numberArray: Stores the array of numbers to be analyzed.
Method findTopKFrequent(int K):

Frequency Calculation:
A HashMap called frequencyMap stores each number in numberArray as a key and its occurrence count as the value.
For each number in numberArray, the map updates the frequency count.
Sorting by Frequency:
Converts the map entries to a list (sortedEntries) and sorts it by:
Frequency in descending order.
If frequencies are equal, by number value in descending order.
Output:
Prints the top K numbers with the highest frequency. The loop prints each of the top K frequent numbers based on the sorted list.
Main Method:

Provides sample arrays and calls findTopKFrequent with specific values for K:
For the array {3, 1, 4, 4, 5, 2, 6, 1} and K = 2, it outputs "4 1".
For the array {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9} and K = 4, it outputs "5 11 7 10".*/
