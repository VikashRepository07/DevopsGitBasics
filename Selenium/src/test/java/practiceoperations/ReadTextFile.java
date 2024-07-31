package practiceoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath ="C:\\Users\\Vikas Chaturvedi\\OneDrive\\Documents\\VikashCoverLetter.txt";
		
	
		try {
		//BufferedReader reader = new BufferedReader(new FileReader(filePath));
			//BufferedReader reader = new BufferedReader(new FileReader(filePath));
			FileReader fl = new FileReader(filePath);//create a file reader to read the file
			FileInputStream fileExcel= new FileInputStream("C:\\Users\\Vikas Chaturvedi\\OneDrive\\Documents\\LoginDetailsforAppliedCompanies.xlsx");
			BufferedReader reader = new BufferedReader(fl);//  // Wrap the FileReader in a BufferedReader for efficient reading
			String line ;
			 while ((line = reader.readLine()) != null) {
	                // Print each line
	              //  System.out.println(line);
	            }
			 
			 Workbook wb = new XSSFWorkbook(fileExcel);
			//Sheet sheet =  wb.getSheetAt(0);
			Sheet sheet = wb.getSheetAt(0);
		
			for (Row rw :sheet)
			{
				for (Cell cl:rw)
				{
					String data = cl.getStringCellValue();
							System.out.print(cl.getStringCellValue() + "\t");
					//System.out.println(data);
					
				}
			}
			wb.close();
		}
		catch (IOException e) {
            // Handle any potential IO exceptions
            e.printStackTrace();
		}
		
		
		
	

}
}