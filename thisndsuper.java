
class A {

    public A() {
        System.out.println("in n");
    }

    public A(int n) {
        System.out.println("in int n");
    }
}

class B extends A {

    public B() {
        System.out.println("in b");
    }

    public B(int N) {
        System.out.println("in int N");
    }
}

public class thisndsuper {

    public static void main(String[] args) {
        B obj = new B(10);  //without any parameter it ll go to b class and then execute the super class with no parameter first and then in b
    }
}
