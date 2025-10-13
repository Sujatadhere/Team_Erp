class Person {
    public String name;
    public int age;
    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    public String course;

    void displayStudent() {
        System.out.println("Course: " + course);
    }
}
public class SingleInheritancePerson {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sujata";   
        s.age = 21;
        s.course = "IT";
        s.displayPerson();
        s.displayStudent();
    }
}
