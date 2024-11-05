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
/*ShareTraderProfitCalculator, calculates the maximum possible profit a trader can make with up to two stock transactions (buy and sell) on different days. 
Each transaction consists of buying and then selling the stock on later days, and the goal is to find the two non-overlapping transactions that maximize the profit.

Method calculateMaxProfit(int[] stockPrices):

Takes an array stockPrices representing the price of a stock for each day.
Variables and Arrays:
days: Stores the total number of days based on the length of stockPrices.
firstTransactionProfit: Array to track the maximum profit achievable up to each day for the first transaction.
secondTransactionProfit: Array to track the maximum profit achievable from each day onward for the second transaction.
Calculating Profits for the First Transaction:
Tracks the minimum stock price encountered so far (minPriceSoFar) as we iterate through the prices.
For each day i, firstTransactionProfit[i] is calculated as the maximum of:
The previous day’s profit.
The profit if selling at the current price (stockPrices[i] - minPriceSoFar).
Calculating Profits for the Second Transaction:
Tracks the maximum stock price encountered so far from the end of the array (maxPriceSoFar).
For each day i (iterating from the end), secondTransactionProfit[i] is calculated as the maximum of:
The next day’s profit.
The profit if buying at the current price (maxPriceSoFar - stockPrices[i]).
Combining Both Transactions:
Iterates through each day, summing firstTransactionProfit[i] and secondTransactionProfit[i] to find the total profit if the two transactions are combined.
Updates maxTotalProfit to store the highest possible combined profit.
Main Method:

Two sample arrays, stockPrices1 and stockPrices2, represent the stock prices over multiple days.
Calls calculateMaxProfit on each sample array:
For {10, 22, 5, 75, 65, 80}, it outputs 87.
For {2, 30, 15, 10, 8, 25, 80}, it outputs 100.*/
