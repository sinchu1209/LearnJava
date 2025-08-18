
class Calci {

    int a;

    public int add(int num1, int num2) {  // method and datatype
        System.out.println("add");
        int r1 = num1 + num2;
        return r1; //you need to return something in a method
    }
}

public class Creatingobj {  // public class should always be same as file name

    public static void main(Stringex[] args) {
        int num1 = 5;
        int num2 = 10;

        Calci cal = new Calci();  // Creating a new object, it has something to do with constructor(which we ll learn later)
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
