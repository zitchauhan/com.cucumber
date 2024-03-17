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

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
