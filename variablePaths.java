import java.util.*;

class NumberOfPaths {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 5;
        int[] steps = { 1, 2, 0, 3, 1 };
        System.out.println(findStep(n, steps));
    }

    public static int findStep(int n, int[] steps) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < steps[i]; j++) {

            }
        }

        return dp[n];
    }
}
