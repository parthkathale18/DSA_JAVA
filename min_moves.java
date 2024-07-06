import java.util.*;

class min_moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            int temp = 2 * n;
            for (int j = 1; j <= a[i] && i + j <= n; j++) {
                if (dp[i + j] == -1)
                    continue;

                temp = Math.min(dp[i + j], temp);
            }
            if (temp != 2 * n)
                dp[i] = temp + 1;
        }
        System.out.println(dp[0]);
    }

}