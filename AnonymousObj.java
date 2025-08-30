
class A {

    public A() {
        System.out.println("in n");
    }

    public void show() {
        System.out.println("in show");
    }
}

public class AnonymousObj {

    public static void main(String[] args) {
        // A obj = 
        new A().show();
        // obj.show();
    }
}
