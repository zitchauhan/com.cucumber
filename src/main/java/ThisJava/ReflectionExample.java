package ThisJava;
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");
            System.out.println("Class name: " + clazz.getName());

            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
