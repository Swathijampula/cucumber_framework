package Jampula;

import java.sql.*;


public class FetchingRecord {

	public static void main(String[] args) throws Throwable{
		String dburl="jdbc:mysql://localhost:3306/evengbatch";
		String username="root";
		//loading jdbc
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(dburl,username,"");
Statement smt=con.createStatement();
ResultSet rs=smt.executeQuery("select *from emp");
while(rs.next())
{
//System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"   "+rs.getInt(3));
System.out.println(rs.getString(1)+"   "+rs.getInt(3));
}

	}

}












