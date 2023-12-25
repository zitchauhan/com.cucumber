package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	static String XLfile = "C:/Users/zitch/Desktop/data_sheet1.xlsx";
	static String XLSheet = "XLSheet";
	static String data = "";

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	/// method 1 for row count ;

	public static void main(String[] args) throws IOException, FileNotFoundException {

		System.out.println(getRowCount(XLfile, XLSheet));
		System.out.println(getCellCount(XLfile, XLSheet));

		System.out.println(getCellData(XLfile, XLSheet, 0, 0, data));

		for (int i = 0; i <= getRowCount(XLfile, XLSheet); i++) { //
			System.out.println(i);
			for (int j = 0; j <= getCellCount(XLfile, XLSheet); j++) {

				System.out.println(worksheet.getRow(i).getCell(j));
			}

		}

		// excelReadAllData();
		// getCellCount(XLfile, XLSheet);
		// setCellData(XLfile, XLSheet, 0, 0, XLSheet);
		// getCellData(XLfile, XLSheet, 0, 0, XLSheet);
	}

	public static int getRowCount(String XLfile, String XLSheet) throws IOException {
		// String XLSheet = "XLSheet";
		fis = new FileInputStream(XLfile);
		workbook = new XSSFWorkbook(fis);
		worksheet = workbook.getSheet(XLSheet);
		int rowCount = worksheet.getLastRowNum();
		workbook.close();
		fis.close();
		return rowCount;

	}

	// to get the cell count
	public static int getCellCount(String XLfile, String XLSheet) throws IOException, FileNotFoundException {

		fis = new FileInputStream(XLfile);
		workbook = new XSSFWorkbook(fis);
		worksheet = workbook.getSheet(XLSheet);
		row = worksheet.getRow(0);
		int cellCount = row.getLastCellNum();
		workbook.close();
		fis.close();
		return cellCount;

	}

// write the data in excel sheet 
	public static void setCellData(String XLfile, String XLSheet, int rowNumber, int columnNumber, String data)
			throws IOException {

		fis = new FileInputStream(XLfile);
		workbook = new XSSFWorkbook(fis);
		worksheet = workbook.getSheet(XLSheet);
		row = worksheet.getRow(rowNumber);
		cell = row.getCell(columnNumber);
		cell.setCellValue(data);
		fos = new FileOutputStream(XLfile);
		workbook.close();
		fis.close();
		fos.close();

	}

	public static String getCellData(String XLfile, String XLSheet, int rowNumber, int columnNumber, String data)
			throws IOException {

		try {
			fis = new FileInputStream(XLfile);
			workbook = new XSSFWorkbook(fis);
			worksheet = workbook.getSheet(XLSheet);
			row = worksheet.getRow(rowNumber);
			cell = row.getCell(columnNumber);

			if (row != null) {
				cell = row.getCell(columnNumber);

				if (cell != null) {
					DataFormatter formatter = new DataFormatter();
					data = formatter.formatCellValue(cell);
				} else {
					System.out.println("Cell is empty/null");
				}
			} else {
				System.out.println("Row is empty/null");
			}
		} catch (

		Exception e) {
			e.printStackTrace();
			System.out.println("Error reading cell data: " + e.getMessage());
		} finally {
			if (workbook != null) {
				workbook.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
		return data; // Return the cell value
	}

	public static void excelReadAllData() throws IOException {
		File src = new File("C:/Users/zitch/Desktop/data_sheet1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("XLSheet");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			// System.out.println(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {

				System.out.println(sheet.getRow(i).getCell(j));
			}

		}

		// System.out.println(cell);
		/*
		 * System.out.println(sheet.getRow(0).getCell(0)); // row 0 cell 0
		 * System.out.println(sheet.getRow(0).getCell(1)); // row 0 , cell 1
		 * System.out.println(sheet.getRow(1).getCell(1)); // row 1, cell 1
		 * 
		 * System.out.println(sheet.getRow(1).getCell(0));
		 * 
		 * 
		 */
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row1 = rowIterator.next();
			Iterator<Cell> cellIterator = row.iterator();
			while (cellIterator.hasNext()) {
				Cell cell1 = cellIterator.next();
				// Process the cell value
			}
		}

	}
}
