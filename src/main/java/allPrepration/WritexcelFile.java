package allPrepration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritexcelFile {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("SheetOne");

		Object[][] data = { 
							{ "Name", "Location", "Experience" }, 
							{ "Arun", "Hyderabad", 16 },
							{ "Varun", "Bangalore", 8 }, 
							{ "Tharun", "Delhi", 4 } 
				
							};

		int rows = data.length;
		int cols = data[0].length;

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.createCell(c);
				Object value = data[r][c];

				if (value instanceof String) {

					cell.setCellValue((String) value);

				} else if (value instanceof Integer) {

					cell.setCellValue((Integer) value);

				} else if (value instanceof Boolean) {

					cell.setCellValue((Boolean) value);

				}

			}

		}

		File file = new File(System.getProperty("user.dir") + "\\files\\Employees.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);

		workbook.close();

	}

}