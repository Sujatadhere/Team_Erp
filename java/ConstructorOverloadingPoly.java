
    class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name) {
        this.name = name;
        this.age = 18;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ConstructorOverloadingPoly {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sarthak");
        Student s3 = new Student("Sujata", 21);
        s1.show();
        s2.show();
        s3.show();
    }
}

    
