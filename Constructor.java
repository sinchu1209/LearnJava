
class Human {

    private int age;// private int age=10;
    private String name;// private String name="sinchu";   you can also set values using methods

    public Human() {      //default Constructor
        age = 22;
        name = "sinchana";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18, "sudha");
        // obj.setAge(12);
        // obj.setName("sinchu");

        System.out.println(obj.getAge() + ": " + obj.getName());
        System.out.println(obj1.getAge() + ": " + obj1.getName());
    }
}
