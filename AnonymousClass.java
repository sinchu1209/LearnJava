
class A {

    public void show() {
        System.out.println("showing 1");
    }
}

public class AnonymousClass {

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {   // this is inner class as it is inside a demo class and it is doesnt have a name so it is
                System.out.println("showing 2");  //-anonymous class
            }
        };
        obj.show();
    }
}
