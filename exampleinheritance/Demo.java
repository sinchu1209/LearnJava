package exampleinheritance;

public class Demo {

    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(5, 10);
        int r2 = obj.sub(18, 5);
        int r3 = obj.mul(10, 5);
        int r4 = obj.div(15, 5);
        double r5 = obj.powe(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
