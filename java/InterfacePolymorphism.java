
    interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}
public class InterfacePolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw();  
        s2.draw();
    }
}

    

