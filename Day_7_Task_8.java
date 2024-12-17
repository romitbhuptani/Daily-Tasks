import java.util.Scanner;

public class Day_7_Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter element "+(i+1));
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if(arr[i]%2==0){
                System.out.println("No the list does not contain only odd  numbers");
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("The list contains only odd numbers");
        sc.close();
    }
}
