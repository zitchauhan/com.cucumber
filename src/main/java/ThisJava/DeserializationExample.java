package ThisJava;
import java.io.*;

public class DeserializationExample {
	
	
	
    public static void main(String[] args) {
    	
    	Student1 s = new Student1("jk", 100);
    	
        try {
            // Deserialization
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student1 student = (Student1) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Student: " + student.getName() + ", " + student.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
