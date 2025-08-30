
public class WrapperClass {

    public static void main(String[] args) {
        int num = 7;
        //auto-boxing
        Integer num1 = num; //taking primitive value and storing it in a object
        //auto-unboxing
        int num2 = num1.intValue();
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 3);

    }
}
