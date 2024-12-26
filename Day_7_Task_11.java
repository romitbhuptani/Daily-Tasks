import java.util.Scanner;

public class Day_7_Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // Double num = sc.nextDouble();
        // String str = num.toString();
        // String[] parts = str.split("\\." );
        // int decLength = parts[1].length();
        // StringBuffer sb = new StringBuffer(String.join("", parts)) ;
        // StringBuffer rev = sb.reverse();
        // System.out.println(rev.insert(rev.length()-decLength, '.'));
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] parts = str.split("\\$" );
        int[] partsLength = new int[parts.length-1];
        int preSum = 0;
        for (int i = 0; i < parts.length-1; i++) {
            preSum += parts[i].length();
            partsLength[i] = preSum;
            preSum += 1;
        } 
        for(int i = 0; i < partsLength.length; i++) {
            System.out.println(partsLength[i]);
        }

        StringBuffer sb = new StringBuffer(String.join("", parts)) ;
        StringBuffer rev = sb.reverse();
        for(int i = 0; i < partsLength.length; i++) {
            rev.insert(partsLength[i],'$');
        }
        System.out.println(rev);
        sc.close();
    }
}
