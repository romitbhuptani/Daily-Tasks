import java.util.Scanner;

public class Day_7_Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you want to find");
        String str = sc.nextLine();
        System.out.println("Enter the string you want to find");
        String find = sc.next();
        int ind = str.indexOf(find);
        if(ind==-1) System.out.println("The string you want to find is not in the main string");
        else
        System.out.println("The string you want to find is at : "+ind);
        sc.close();
    }
}
