class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp[0][i] = 1;
            }
        }
        for(int ind =1; ind <n;ind++){
            for(int target = 0; target <= amount; target++){
                long notTaken = dp[ind-1][target];
                long taken = 0;
                if(coins[ind]<=target){
                    taken = dp[ind][target-coins[ind]];
                }
                dp[ind][target] = notTaken + taken;
            }
        }
        return (int)dp[n-1][amount];
    }
}
