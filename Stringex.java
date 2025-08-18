
public class Stringex {

    public static void main(String[] args) {
        String name = new String("Sinchana");
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" Siddesh"));

        String name1 = "sudha"; // this works too
        name1 = name1 + " siddesh"; // this changes but that is not the way it shd work
        System.out.println(name1);
    }
}
