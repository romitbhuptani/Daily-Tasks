import java.util.Arrays;
import java.util.Scanner;

public class Day_8_Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int len = sc.nextInt();
        char[] charArray = new char[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter element : "+(i+1));
            charArray[i] = sc.next().charAt(0);
        }
        Arrays.sort(charArray);
        System.out.println("Sorted array: " + Arrays.toString(charArray));
        sc.close();
    }
}
