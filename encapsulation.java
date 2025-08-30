
class Human {

    private int age;// private int age=10;
    private String name;// private String name="sinchu";   you can also set values using methods

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("sinchu");

        t.println(obj.getAge() + ": " + obj.getName());
    }
}
