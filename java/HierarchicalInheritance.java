
    class Sport {
    void type() {
        System.out.println("Sports can be indoor or outdoor.");
    }
}
class Cricket extends Sport {
    void play() {
        System.out.println("Playing Cricket with bat and ball.");
    }
}
class Football extends Sport {
    void play() {
        System.out.println("Playing Football with a ball.");
    }
}
class Chess extends Sport {
    void play() {
        System.out.println("Playing Chess indoors.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        Football f = new Football();
        Chess ch = new Chess();
        c.type(); c.play();
        f.type(); f.play();
        ch.type(); ch.play();
    }
}

    

