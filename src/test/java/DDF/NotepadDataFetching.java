package DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class NotepadDataFetching {
public static void main(String[] args) throws Exception {
//create object of FIS class
FileInputStream fisp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\seleniumWD\\SeleniumWD\\src\\test\\java\\DDF\\Das.properties");
//create object for properties class
Properties p=new Properties();
p.load(fisp);
String UN=p.getProperty("un");
System.out.println(UN);
//admin

}
	
}

