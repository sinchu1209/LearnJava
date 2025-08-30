
public class Buffernbuilder {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  //Intial capacity is 16 so that if no space left it ll relocate
        StringBuffer sb1 = new StringBuffer("sinchuuuuu");
        System.out.println(sb1.length());
        System.out.println(sb1.append(" sid"));
        System.out.println(sb1.toString());

    }
}
