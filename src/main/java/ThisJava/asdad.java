/*
 * import java.util.*;
 * 
 * public class XMLGenerationExample { public static void main(String[] args) {
 * try { List<Student> students = Arrays.asList( new Student("Alice", 25), new
 * Student("Bob", 30) );
 * 
 * JAXBContext context = JAXBContext.newInstance(StudentList.class); Marshaller
 * marshaller = context.createMarshaller();
 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 * 
 * StudentList studentList = new StudentList();
 * studentList.setStudents(students);
 * 
 * marshaller.marshal(studentList, System.out); } catch (Exception e) {
 * e.printStackTrace(); } } }
 * 
 * import javax.xml.bind.annotation.*;
 * 
 * @XmlRootElement class StudentList { private List<Student> students;
 * 
 * @XmlElement(name = "student") public List<Student> getStudents() { return
 * students; }
 * 
 * public void setStudents(List<Student> students) { this.students = students; }
 * }
 * 
 */