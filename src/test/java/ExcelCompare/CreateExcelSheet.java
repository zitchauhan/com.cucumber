package ExcelCompare;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet 
	{
    public static void main(String[] args) 
    	{
        // Create a new workbook
        try (Workbook workbook = new XSSFWorkbook()) 
        
        {
            // Create a sheet named "tutorialsninjadata"
            Sheet masterSheet = workbook.createSheet("tutorialsninjadata");

            // Create header row
            Row headerRow = masterSheet.createRow(0);
            String[] headers = {"Email", "PassWord"};
            for (int i = 0; i < headers.length; i++) 
            {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Sample data
            Object[][] data = { 
                { "allj@beta.com", "3990" },
                { "alfa@beta.com", "3124" },
                { "abd@gmail.com", "123" }
            };

            // Fill data rows
            for (int i = 0; i < data.length; i++) 
            {
                Row row = masterSheet.createRow(i + 1);
                for (int j = 0; j < data[i].length; j++) 
                {
                    Cell cell = row.createCell(j);
                    if (data[i][j] instanceof String) 
                    {
                        cell.setCellValue((String) data[i][j]);
                    }
                }
            }

            // Write the workbook to a file
            try (FileOutputStream fileOut = new FileOutputStream("tutorialsninjadata.xlsx")) {
                workbook.write(fileOut);
                System.out.println("Excel file created successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
