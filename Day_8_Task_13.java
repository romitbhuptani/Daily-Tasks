import java.util.Scanner;

public class Day_8_Task_13 {
    public static int fact(int x){
        int fact = 1;
        for(int i=1 ; i<=x ; i++){
            fact *= i;
        }
        return fact;
    }
    public  static int calculatePer(int num1,int num2){
        return (fact(num1)/fact(num1-num2));
    }
    public  static int calculateCom(int num1,int num2){
        return (fact(num1)/(fact(num1-num2)*fact(num2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("The permutation of the numbers is: "+calculatePer(num1,num2));
        System.out.println("The combination of the numbers is: "+calculateCom(num1,num2));
        sc.close();
    }
}
