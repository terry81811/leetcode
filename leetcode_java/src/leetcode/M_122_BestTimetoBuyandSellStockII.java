package leetcode;

import java.util.ArrayList;

public class M_122_BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        
        ArrayList<Integer> transactions = new ArrayList<Integer>();
        
        int currentBuy = prices[0];
        int currentSell = 0;
        int profit = 0;
        
        for(int i = 1; i<prices.length; i++) {
            if(currentBuy > prices[i]) {
                currentBuy = prices[i];
                System.out.println("currentBuy: "+currentBuy);
            }
            
            if(currentSell <= prices[i]) {
                currentSell = prices[i];
                System.out.println("currentSell: "+currentSell);
            }else { //lets sell!
                System.out.println("profit: "+currentSell +" - "+currentBuy);

                profit = profit + currentSell - currentBuy;
                currentSell = 0;
                currentBuy = prices[i];
            }
            System.out.println(i+": "+"b: "+currentBuy+", s: "+currentSell);
        }
        if(currentSell > currentBuy) {
            profit = profit + currentSell - currentBuy;
        }
        System.out.println("profit: "+profit);
        
        return profit;
        
        
    }
    
    public static void main(String[] args) {
    	M_122_BestTimetoBuyandSellStockII o = new M_122_BestTimetoBuyandSellStockII();
    	int[] prices = {3,4,1,2};
    	o.maxProfit(prices);
    }
}
