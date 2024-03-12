package ThisJava;
import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Object to serialize
            Student student = new Student("Alice", 25);

            // Serialization
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
}
