public class Day_8_Task_5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
            if(j==0 || i==n-1 || j==n-1)  System.out.print("* ");
            else System.out.print("  ");
            }
            for(int j = 0 ; j<n-1 ; j++){
                if(i==0 || i==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n;j++){
            if(i==n-2 || j==n-1) System.out.print("* ");
            else System.out.print("  ");
            }
            for(int j = 0 ; j<n-1 ; j++){
                if(j==n-2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
