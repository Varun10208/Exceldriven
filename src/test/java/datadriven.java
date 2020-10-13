import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriven {

	
@Test
public void testdatadriven() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\varuny\\eclipse-workspace\\Exceldriven\\Demo_Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int sheets=wb.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{  //System.out.println(wb.getSheetName(i));
		if(wb.getSheetName(i).equalsIgnoreCase("DemoData")) {
			 XSSFSheet sheet=wb.getSheetAt(i);
			 Iterator<Row> rows=sheet.iterator();
			 while(rows.hasNext()){
			 Row currentrow=rows.next();
			 Iterator<Cell> cells=currentrow.cellIterator();
			 while(cells.hasNext())
			 {
				 Cell value=cells.next();
				System.out.print(value.getStringCellValue()+" ");
			 }
			 System.out.println();
			 
		}
		}
		}}}