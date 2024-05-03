package DDF;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBoleandata {

	public static void main(String[] args) throws Throwable{
	
FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\seleniumWD\\SeleniumWD\\src\\main\\resources\\excel.xlsx");
boolean data=WorkbookFactory.create(fise).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
System.out.println(data);
}
}