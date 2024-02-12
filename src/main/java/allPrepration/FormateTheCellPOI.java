package allPrepration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormateTheCellPOI {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheetOne = workbook.createSheet("SheetOne");

		String[][] data = { 
							{ "Name" }, 
							{ "Arun" }, 
							{ "Varun" }, 
							{ "Tharun" } 
							
								};

		int rows = data.length;
		int cols = data[0].length;

		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setBorderTop(BorderStyle.THICK);
		style.setTopBorderColor(IndexedColors.DARK_RED.getIndex());
		style.setBorderBottom(BorderStyle.THICK);
		style.setBottomBorderColor(IndexedColors.DARK_RED.getIndex());
		style.setBorderLeft(BorderStyle.THICK);
		style.setLeftBorderColor(IndexedColors.DARK_RED.getIndex());
		style.setBorderRight(BorderStyle.THICK);
		style.setRightBorderColor(IndexedColors.DARK_RED.getIndex());

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheetOne.createRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.createCell(c);
				String value = data[r][c];

				cell.setCellValue(value);
				cell.setCellStyle(style);

			}

		}

		File file = new File(System.getProperty("user.dir") + "\\files\\Names.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);

		workbook.close();

		System.out.println("Task Completed");

	}

}
