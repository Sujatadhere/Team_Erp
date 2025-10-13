
    class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
class Puppy extends Dog {
    void sleep() {
        System.out.println("Puppy is sleeping...");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();  
        p.bark();  
        p.sleep(); 
    }
}

    

