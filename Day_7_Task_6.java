class Day_7_Task_6{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child p2 = new Child();
        GrandChild p3 = new GrandChild();
        System.out.println(p1.met());
        System.out.println(p2.met());
        System.out.println(p3.met());
    }
}
class Parent{
    String met(){
        return "I am parent";
    }
}

class Child{
    String met(){
        return "I am child";
    }
}

class GrandChild{
    String met(){
        return "I am grand child";
    }
}