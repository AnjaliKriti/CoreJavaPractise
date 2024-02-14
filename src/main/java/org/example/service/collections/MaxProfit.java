package org.example.service.collections;

//Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the
//        maximum profit possible by buying and selling the stocks on different days when at most one transaction is
//        allowed.
//        Note: Stock must be bought before being sold.
//        Examples:
//        Input: prices[] = {7, 1, 5, 3, 6, 4}
//        Output: 5

public class MaxProfit {
    public static void  main(String arr[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int day = 4;
        findMaxProfit(prices, day);
    }

    private static void findMaxProfit(int[] prices, int day) {

        int newPriceIndex = day -1;
        int size = prices.length - newPriceIndex;
        int[] newPriceList = new int[size];


        for(int i = 0 ; i<size ; i++){
            newPriceList[i] = prices[newPriceIndex];
            newPriceIndex++;
        }

      int max =  findMaxPrice(newPriceList);
       int min = findLowestPrice(newPriceList);
       System.out.println("Maximum profit on day "+ day + " is : " + (max-min));
    }

    private static int findLowestPrice(int[] newPriceList) {
        int min = Integer.MAX_VALUE;
        for(int i : newPriceList){
            if ( i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int findMaxPrice(int[] newPriceList) {

        int max =Integer.MIN_VALUE;
        for(int i : newPriceList){
            if ( i > max) {
                max = i;
            }
        }
        return max;
    }
}
