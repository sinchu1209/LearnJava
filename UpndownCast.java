
class A {

    public void show1() {
        System.out.println("In show 1");
    }
}

class B extends A {

    public void show2() {
        System.out.println("In show 2");
    }
}

public class UpndownCast {

    public static void main(String[] args) {
        //Upcasting as it is going up, object of subclass assigning to a parent class
        A obj = new B();  // reference of A and object of B nd u need not mention (A) as it is already implicitly mentioned
        obj.show1(); // it wont override because both methods have different name

        B obj1 = (B) obj;
        obj1.show2();
    }
}
