import java.util.Scanner;

public class Day_8_Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =   sc.nextInt();;
        int copyNum = num;
        int len = String.valueOf(copyNum).length();
        int sum = 0;
        while(copyNum > 0) {
            int rem = copyNum % 10;
            sum += Math.pow(rem,len);
            copyNum = copyNum / 10;
        }
        if(sum==num){
            System.out.println("The number is armstrong number.");
        }
        else{
            System.out.println("The number is not armstrong number.");
        }
        sc.close();
    }
}
