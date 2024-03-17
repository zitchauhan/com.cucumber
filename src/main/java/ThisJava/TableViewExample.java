/*
 * package ThisJava;
 * 
 * import javafx.application.Application; import javafx.scene.Scene; import
 * javafx.scene.control.TableColumn; import javafx.scene.control.TableView;
 * import javafx.scene.control.cell.PropertyValueFactory; import
 * javafx.stage.Stage;
 * 
 * public class TableViewExample extends Application {
 * 
 * @Override public void start(Stage primaryStage) { TableView<Student> table =
 * new TableView<>();
 * 
 * TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
 * nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
 * 
 * TableColumn<Student, Integer> ageColumn = new TableColumn<>("Age");
 * ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
 * 
 * table.getColumns().addAll(nameColumn, ageColumn);
 * 
 * table.getItems().addAll( new Student("Alice", 25), new Student("Bob", 30),
 * new Student("Charlie", 28) );
 * 
 * Scene scene = new Scene(table, 300, 200); primaryStage.setScene(scene);
 * primaryStage.setTitle("TableView Example"); primaryStage.show(); }
 * 
 * public static void main(String[] args) { launch(args); } }
 * 
 * class Student { private String name; private int age;
 * 
 * public Student(String name, int age) { this.name = name; this.age = age; }
 * 
 * public String getName() { return name; }
 * 
 * public int getAge() { return age; } }
 */