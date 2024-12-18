class Day_8_Task_10{
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j <= i;j++){
                if(i==0) System.out.print("*");
                else if(j==i) System.out.print("*");
                else System.out.print("*"+k);
            }
            System.out.println();
            if (i==0) continue;
            k++;
        }
    }
}