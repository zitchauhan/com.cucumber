/*
 * package ThisJava; import java.lang.annotation.*;
 * 
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 * @Target(ElementType.METHOD) public @interface TestAnnotation { String value()
 * default ""; }
 * 
 * public class AnnotationExample1 {
 * 
 * @TestAnnotation("Some test") public void testMethod() {
 * System.out.println("Test method"); }
 * 
 * public static void main(String[] args) throws NoSuchMethodException {
 * Annotation[] annotations =
 * AnnotationExample1.class.getMethod("testMethod").getAnnotations(); for
 * (Annotation annotation : annotations) { if (annotation instanceof
 * TestAnnotation) { TestAnnotation testAnnotation = (TestAnnotation)
 * annotation; System.out.println("Annotation value: " +
 * testAnnotation.value()); } } } }
 */