
class Mobile {

    String brand;
    int price;
    static String name;   // it will be shared by all the objects

    public void show() {
        System.out.println(brand + ": " + price + ": " + name);
    }
}

public class StaticVariable {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 15000;
        Mobile.name = "Smartphone";  // if u have used static keyword then instead of using object u hav eto use class name

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 19000;
        Mobile.name = "Smartphone";

        Mobile.name = "phone";

        obj1.show();
        obj2.show();

    }
}
