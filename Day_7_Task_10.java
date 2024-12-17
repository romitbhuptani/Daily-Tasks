import java.util.Scanner;

public class Day_7_Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        String[] strarr = str.split(" "); 
        System.out.println("Enter the position ");
        int find = sc.nextInt();
        System.out.println("The string at given position : "+strarr[find-1]); 
        sc.close();
    }
}
