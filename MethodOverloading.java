
class Calci {

    int a;
// Method overloading refers to those method which can have same name as long as the parameters/ types are different

    public int add(int num1, int num2) {
        System.out.println("add");
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Calci cal = new Calci();
        int res = cal.add(2, 3, 5);
        System.out.println(res);

    }
}
