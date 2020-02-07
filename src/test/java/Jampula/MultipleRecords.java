package Jampula;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRecords {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		File f=new File("E:\\Seleniumexl.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		int rc=sh.getLastRowNum();
		System.out.println("no of rows are:::"+rc);
		for(int i=1;i<=rc;i++){
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/citibank","root","");
		   Statement stmt=con.createStatement();
		   String ename=sh.getRow(i).getCell(0).getStringCellValue();
		   double eng=sh.getRow(i).getCell(1).getNumericCellValue();
		   double esal=sh.getRow(i).getCell(2).getNumericCellValue();
		  //To Insert Records
		stmt.executeUpdate("insert into emp values('"+ename+"',"+eng+","+esal+")");
		}
	wb.close();

}
}
