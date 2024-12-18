public class Day_8_Task_9 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if(j==n-1 && i==n) System.out.print(" ");
                else if (j == 0 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i; j++) {
                 if(j==n-1 && i==n) System.out.print(" * ");
                 else if (j == 0 || j == i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = n; j > i; j--) {
                if (j == n || j == i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = n; j > i; j--) {
                if (j == n || j == i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
