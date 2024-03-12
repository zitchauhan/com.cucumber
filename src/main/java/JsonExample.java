import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonExample {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"Alice\",\"age\":25}";

        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(json, Student.class);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

class Student {
    private String name;
    private int age;

    // Getters and setters
}
