public class Day_7_Task_12 {
    public static void main(String[] args) {
        War wr = new War();
        wr.attack();
        wr.use();
    }
}
 interface Char {
    void attack();
}
interface Weapon{
    void use();
}
class War implements Char,Weapon{
    public void attack(){
        System.out.println("Attack");
    }
    public void use(){
        System.out.println("Use");
    }
}
