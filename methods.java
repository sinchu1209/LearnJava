
class Computer {

    public void PlayMusic() {
        System.out.println("Playing music");
    }

    public Strings getAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

public class methods {

    public static void main(Strings[] args) {
        Computer comp = new Computer();
        comp.PlayMusic();
        Strings str = comp.getAPen(3);
        System.out.println(str);
    }
}
