import java.util.*;

class NumberOfPaths {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findStep(n));
    }

    public static int findStep(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i >= 2)
                dp[i] += dp[i - 2];
            if (i >= 3)
                dp[i] += dp[i - 3];
        }

        return dp[n];
    }
}
