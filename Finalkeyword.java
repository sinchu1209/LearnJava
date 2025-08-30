
final class Computer {

    public final void show() {
        System.out.println("by sinchuuu");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Laptop { //extends Computer {   // if u dont want the class to extend then u can use final

    public void show() {
        System.out.println("by sanjuu");
    }
}

public class Finalkeyword {

    public static void main(String[] args) {
        int num = 3;
        num = 4;
        System.out.println(num);

        final int num1 = 9;
        // num1 =10;  // cannot be changed
        System.out.println(num1);
        Computer Obj = new Computer();
        Obj.show();
        Obj.add(3, 4);
    }
}
