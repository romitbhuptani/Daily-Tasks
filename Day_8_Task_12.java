import java.util.Scanner;

public class Day_8_Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:  ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String[] newArr = new String[arr.length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[n-i-1];
        }
        System.out.println("The reversed string is: "+String.join(" ", newArr));
        sc.close();
    }
}
