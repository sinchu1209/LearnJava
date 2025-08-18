
class Computer {

    public void PlayMusic() {
        System.out.println("Playing music");
    }

    public Stringex getAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

public class methods {

    public static void main(Stringex[] args) {
        Computer comp = new Computer();
        comp.PlayMusic();
        Stringex str = comp.getAPen(3);
        System.out.println(str);
    }
}
