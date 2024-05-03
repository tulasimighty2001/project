package DDF;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {

	public static void main(String[] args) throws Throwable{
	
FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\seleniumWD\\SeleniumWD\\src\\main\\resources\\excel.xlsx");
String data=WorkbookFactory.create(fise).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
}
}