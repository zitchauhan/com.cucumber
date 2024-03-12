package LoginFunnality;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class TextFieldApplication {

    public void apply_data_to_text_field(DataTable table) {
    	
        List<Map<String, String>> list = table.asMaps(String.class, String.class);

         // list.get("Name" , "A");
        
        for (Map<String, String> row : list)
        
        {
            String name = row.get("Name");
            String empno = row.get("empno");
            String salary = row.get("salary");

            // Assuming you have a method to apply data to text fields
            applyDataToTextField(name, empno, salary);
        }
    }

    private void applyDataToTextField(String name, String empno, String salary) {
        // Your logic to apply data to text fields goes here
        // For example:
        System.out.println("Applying data to text fields:");
        System.out.println("Name: " + name);
        System.out.println("Empno: " + empno);
        System.out.println("Salary: " + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        TextFieldApplication textFieldApplication = new TextFieldApplication();
        DataTable table =DataTable.create(null);
               /*
                        Map.of("Name", "bcd", "empno", "2", "salary", "10000"),
                        Map.of("Name", "cde", "empno", "3", "salary", "10000"),
                        Map.of("Name", "def", "empno", "4", "salary", "10000"),
                        Map.of("Name", "efg", "empno", "5", "salary", "10000")*/
                
        
        textFieldApplication.apply_data_to_text_field(table);
    }
}
