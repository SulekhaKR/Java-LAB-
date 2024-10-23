public class ShareTraderProfitCalculator {
    // Method to find the maximum profit with 2 transactions
    public static int calculateMaxProfit(int[] stockPrices) {
        int days = stockPrices.length;
        int[] firstTransactionProfit = new int[days];
        int[] secondTransactionProfit = new int[days];

        // Track the minimum price for the first transaction
        int minPriceSoFar = stockPrices[0];
        for (int i = 1; i < days; i++) {
            minPriceSoFar = Math.min(minPriceSoFar, stockPrices[i]);
            firstTransactionProfit[i] = Math.max(firstTransactionProfit[i - 1], stockPrices[i] - minPriceSoFar);
        }

        // Track the maximum price for the second transaction
        int maxPriceSoFar = stockPrices[days - 1];
        for (int i = days - 2; i >= 0; i--) {
            maxPriceSoFar = Math.max(maxPriceSoFar, stockPrices[i]);
            secondTransactionProfit[i] = Math.max(secondTransactionProfit[i + 1], maxPriceSoFar - stockPrices[i]);
        }

        // Combine the profits from both transactions
        int maxTotalProfit = 0;
        for (int i = 0; i < days; i++) {
            maxTotalProfit = Math.max(maxTotalProfit, firstTransactionProfit[i] + secondTransactionProfit[i]);
        }

        return maxTotalProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices1 = {10, 22, 5, 75, 65, 80};
        System.out.println(calculateMaxProfit(stockPrices1));  // Output: 87

        int[] stockPrices2 = {2, 30, 15, 10, 8, 25, 80};
        System.out.println(calculateMaxProfit(stockPrices2));  // Output: 100
    }
}
