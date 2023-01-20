package DP;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(ocean(50, new int[]{10, 20, 50})); // 4

        System.out.println(ocean(100, new int[]{10, 20, 50})); // 10

        System.out.println(ocean(30, new int[]{5, 6, 7})); // 4
    }
    public static long ocean(int target, int[] type) {
        long[] dp = new long[target+1];
        dp[0] = 1;

        //돈의 종류
        for(int i = 0; i<type.length; i++){
            //원하는금액
            for (int j = 1; j <= target; j++) {
                if(j-type[i]>=0) dp[j] = dp[j] + dp[j-type[i]];
            }
        }

        return dp[target];
    }
}
