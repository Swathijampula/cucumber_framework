package Jampula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class IsertRecord {
	public static void main(String[] args) throws Throwable{
		//loading jdbc
		Class.forName("com.mysql.jdbc.Driver");
	//connect to database
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evengbatch","root","");
//send sql quiries
	Statement  smt=con.createStatement();
	//smt.executeUpdate("insert into emp values('Akhilesh',201,50000)");
	smt.executeUpdate("update emp set ename='Selenium' where ename='Akhilesh'");
	//smt.executeUpdate("delete from emp where ename='selenium'");
	con.close();
	}


}
