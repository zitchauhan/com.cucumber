import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static Map<String, String> getMapdata() throws Throwable {

		Map<String, String> ecxeldata = new HashMap<String, String>();

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\zitch\\Documents\\demo.xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			// XSSFSheet sheet = wb.getSheetAt(1);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			int lastrownum = sheet1.getLastRowNum();

			for (int i = 1; i < lastrownum; i++) {
				XSSFRow row = sheet1.getRow(i);

				XSSFCell keycell = row.getCell(0);
				String key = keycell.getStringCellValue().trim();
//System.out.println(key);
				XSSFCell value_Cell = row.getCell(1);
				String value = value_Cell.getStringCellValue().trim();
				ecxeldata.put(key, value);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			// TODO: handle exception
		}

		return ecxeldata;
	}

	public static void main(String[] args) throws Throwable {
		try {
			Map<String, String> ecxeldata = ExcelUtility.getMapdata();

			for (Map.Entry<String, String> entry : ecxeldata.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				System.out.println("key is : " + key + " vlaue is : " + val);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
