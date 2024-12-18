import java.util.ArrayList;
import java.util.Scanner;

public class Day_8_Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < ch.length; i++){
            if(ch[i]!=' ')
            list.add(String.valueOf(ch[i]));
        }
        System.out.println("After removing whitespace: "+String.join("", list));
        sc.close();

    }
}
