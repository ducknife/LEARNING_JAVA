import java.util.*;

public class _GT_ThiDau {
    public static void main(String[] args){
        final int MOD = (int) 1E9 + 9;
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            List<Long> a = new ArrayList<>();
            List<Long> b = new ArrayList<>();
            for (int i = 0; i < n; i++){
                long x = sc.nextInt();
                a.add(x);
            }
            for (int i = 0; i < m; i++){
                long y = sc.nextInt();
                b.add(y);
            }
            a.sort((Long x, Long y) -> (int) (x - y));
            b.sort((Long x, Long y) -> (int) (x - y));
            long[][][] dp = new long[n + 1][m + 1][k + 1];
            for (int i = 0; i <= n; i++){
                for (int j = 0; j <= m; j++){
                    for (int t = 0; t <= k; t++){
                        if (t == 0) dp[i][j][t] = 1;
                        else dp[i][j][t] = 0;
                    }
                }
            }
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= m; j++){
                    for (int t = 1; t <= k; t++){
                        dp[i][j][t] = (dp[i - 1][j][t] % MOD + dp[i][j - 1][t] % MOD + MOD - dp[i - 1][j - 1][t]) % MOD;
                        if (a.get(i - 1) > b.get(j - 1)){
                            dp[i][j][t] = (dp[i][j][t] + dp[i - 1][j - 1][t - 1] % MOD) % MOD;
                        }
                    }
                }
            }
            System.out.println(dp[n][m][k]);
        }
    }
}
