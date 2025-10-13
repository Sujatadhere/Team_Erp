public class Encapsulation {
    private String name;  
    private int age;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
 class  Student{
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setName("Sujata");
        s.setAge(21);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

    

