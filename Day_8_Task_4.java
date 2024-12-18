public class Day_8_Task_4 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 0 ;j<i ; j++){
                if(i==n || j==0 || j==i-1){
                    System.out.print("*");
                }
                
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
