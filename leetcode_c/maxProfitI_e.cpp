class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if (prices.size()==1 || prices.empty())
            return 0;
        int maxprofit = 0;
        int min=prices[0];
        for (int i=1; i<prices.size(); i++) {
            int profit = prices[i]-min;
            if (profit>maxprofit)
                maxprofit = profit;
            if (prices[i]<min)
                min = prices[i];
        }
        return maxprofit;
        
    }
};