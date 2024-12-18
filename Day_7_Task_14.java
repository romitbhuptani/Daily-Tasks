import java.util.Scanner;

public class Day_7_Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message you want to encrypt: ");
        String encString = sc.nextLine();
        char[] encArr = new char[encString.length()];
        for (int i = 0; i < encString.length(); i++) {
            if(i%2 == 0) {
            encArr[i] = (char)((int)encString.charAt(i) + 20);
            }
            else{
                encArr[i] = (char)((int)encString.charAt(i) - 20);
            }
        }
        String[] encArrStr = new String[encArr.length];
        for(int i = 0; i < encArrStr.length;i++){
            encArrStr[i] = String.valueOf(encArr[i]);
        }
        System.out.println("After encryption the string is : "+String.join("", encArrStr));
        char[] decArr = new char[encArrStr.length];
        for(int i = 0; i < encArrStr.length;i++){
            if(i%2==0){
                decArr[i] = (char)((int)encArr[i]-20);
            }
            else{
                decArr[i] = (char)((int)encArr[i]+20);
            }
        }
        String[] decArrStr = new String[decArr.length];
        for(int i = 0; i < decArr.length;i++){
            decArrStr[i] = String.valueOf(decArr[i]);
        }
        System.out.println("After decryption the string is : "+String.join("", decArrStr));
        sc.close();
    }
}
