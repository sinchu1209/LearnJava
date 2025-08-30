
class A {

    int age = 0;

    public void show() {
        System.out.println("showing " + age);
    }

    static class B {    //this is inner class
//make class b static-> you cannot put static keyword for outer class 

        public void config() {
            System.out.println("configuring");
        }
    }
}

public class innerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //how to call config method?
        // A.B obj1 = obj.new B();
        // obj1.config();
        //or else you can also put static method so that u dont need objects
        A.B obj2 = new A.B();
        obj2.config();
    }
}
