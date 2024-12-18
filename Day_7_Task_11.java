import java.util.Scanner;

public class Day_7_Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Double num = sc.nextDouble();
        String str = num.toString();
        String[] parts = str.split("\\." );
        int decLength = parts[1].length();
        StringBuffer sb = new StringBuffer(String.join("", parts)) ;
        StringBuffer rev = sb.reverse();
        System.out.println(rev.insert(rev.length()-decLength, '.'));
        sc.close();
    }
}
