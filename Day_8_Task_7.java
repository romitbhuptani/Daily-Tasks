public class Day_8_Task_7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i==0)
                {
                    if(j==0 || j==n-1) System.out.print(" ");
                    else System.out.print("*");
                }
                else if(i==n-1){
                    if(j==0 || j==n-1) System.out.print(" ");
                    else System.out.print("*");
                } 
                else if(j==0 || j==n-1){
                    if(i!=n-1)
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n; j++) {
                
                if(i==n-2){
                    if(j==0 || j==n-1) System.out.print(" ");
                    else System.out.print("*");
                } 
                else if(j==0 || j==n-1){
                    if(i!=n-1)
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
