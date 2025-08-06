import java.util.Scanner;

public class _GT_HinhVuongLonNhat {
    public static void main(String[] args) {
        int t;
        int[][] dp = new int[501][501];
        int[][] a = new int[501][501];
        int n, m;
        try (Scanner sc = new Scanner(System.in)){
            t = sc.nextInt();
            while (t-- > 0){
                n = sc.nextInt();
                m = sc.nextInt();
                for (int i = 1; i <= n; i++){
                    for (int j = 1; j <= m; j++){
                        a[i][j] = sc.nextInt();
                        dp[i][j] = 0;
                    }
                }
                int res = 0;
                for (int i = 1; i <= n; i++){
                    for (int j = 1; j <= m; j++){
                        if (i == 1 || j == 1) dp[i][j] = a[i][j];
                        else {
                            if (a[i][j] == 1){
                                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]) + 1;
                            }
                        }
                        res = Math.max(res, dp[i][j]);
                    }
                }
                System.out.println(res);
            }
        }
    }
}