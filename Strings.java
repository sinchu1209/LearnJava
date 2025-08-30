
public class Strings {

    public static void main(String[] args) {
        String name = new String("Sinchana");
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" Siddesh"));

        String name1 = "sudha"; // this works too
        name1 = name1 + " siddesh"; // this changes but that is not the way it shd work
        String s1 = "sinch";
        String s2 = "sinch";
        System.out.println(s1 == s2); // that means it only created one object because of string constant pool(refer it again)
        System.out.println(name1);
    }
}
