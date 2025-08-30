
class Human {

    private int age;// private int age=10;
    private String name;// private String name="sinchu";   you can also set values using methods

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

public class thiskeyword {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("sinchu");

        System.out.println(obj.getAge() + ": " + obj.getName());
    }
}
