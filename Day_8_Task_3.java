public class Day_8_Task_3 {
    public static void main(String[] args) {
        int[] arr = {98,32,72,94,75,73,92,36,28,34};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i]!=max && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondMax);
    }
}
