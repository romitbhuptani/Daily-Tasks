import java.util.Scanner;

public class Day_8_Task_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dices: ");
        int dice = sc.nextInt();
        System.out.println("Enter the sum : ");
        int sum = sc.nextInt();
        int[][] dp = new int[dice+1][sum+1];
        dp[0][0] = 1;
        for(int i = 1 ; i<=dice ; i++){
            for(int j = 1 ; j<=sum ; j++){
                for(int k = 1 ; k<= 6 ; k++){
                    if(j-k>=0){
                        dp[i][j] += dp[i-1][j-k];
                    }
                }
            }
        }
        System.out.println(dp[dice][sum]);
    }
}
