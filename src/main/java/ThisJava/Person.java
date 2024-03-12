package ThisJava;
public class Person {
    String name;
    int age;
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.displayInfo();
    }
}
