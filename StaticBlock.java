
class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "sinchu";
        System.out.println("Static block executed");
    }

    public Mobile() {
        brand = " ";
        System.out.println("Constructor called");
    }

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");  //it wont create an obj it ll just instantiate it
        // Mobile obj1 = new Mobile();

        // obj1.brand = "Apple";
        // obj1.price = 15000;
        // Mobile.name = "Smartphone";  // if u have used static keyword then instead of using object u hav eto use class name
        // Mobile obj2 = new Mobile(); // Each time sn object is created it will call the constructor but static block is called only once
    }
}
