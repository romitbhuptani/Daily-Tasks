public class Day_7_Task_13 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("This is string");
        System.out.println(buffer.delete(0, 2));
        System.out.println(buffer.deleteCharAt(1));
        System.out.println(buffer.delete(0,buffer.length()));
    }
}
