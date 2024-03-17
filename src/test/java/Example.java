public class Example {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        // Get the Class object representing the String class
        Class<String> stringClass = String.class;
      
      
        // Print the name of the class
        System.out.println("Class name: " + stringClass.getName());

        // Print the simple name of the class
        System.out.println("Simple class name: " + stringClass.getSimpleName());

        // Print the canonical name of the class
        System.out.println("Canonical class name: " + stringClass.getCanonicalName());

        // Print whether the class is an interface or not
        System.out.println("Is interface: " + stringClass.isInterface());

        // Print whether the class is an enum or not
        System.out.println("Is enum: " + stringClass.isEnum());

        // Print whether the class is an annotation or not
        System.out.println("Is annotation: " + stringClass.isAnnotation());

        // Print whether the class is an array or not
        System.out.println("Is array: " + stringClass.isArray());
    }
}
