
class A {

    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {

    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {    // we can say A is a parent class and B nd c are Subclasses

    public void show() {
        System.out.println("In C show");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();    // This is polymorphism 
        obj.show();
    }
}
