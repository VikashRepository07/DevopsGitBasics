package week6day1;

import java.io.IOException;

import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	XSSFWorkbook wb = new XSSFWorkbook(".\Data\TestData.xlsx");
		public static void main(String[] args) throws IOException {
			
			// Set up the path of the workbook (HSSF for xls)
			XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
			
			// Get into the respective sheet
			XSSFSheet ws = wb.getSheet("Sheet1");
//			XSSFSheet sheetAt = wb.getSheetAt(0);
			
			// Read a particular cell data
//			XSSFRow row = ws.getRow(1);
//			XSSFCell cell = row.getCell(0);
//			String data = cell.getStringCellValue();
//			System.out.println(data);
			
			// to get the total row of data (excluding header)
			int rowCount = ws.getLastRowNum();
			System.out.println(rowCount);
			
			// to get the total row of data (including header)
			int rowCountWithHeader = ws.getPhysicalNumberOfRows();
			System.out.println(rowCountWithHeader);
			
			// to get the total number of cells
			int cellCount = ws.getRow(0).getLastCellNum();
			System.out.println(cellCount);
			
			// get all data from excel excluding header
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < cellCount; j++) {
					String data = ws.getRow(i).getCell(j).getStringCellValue();
					System.out.println(data);
				}
			}
			
			// Close the workbook
			wb.close();
			
			
		}

	

		
	}

