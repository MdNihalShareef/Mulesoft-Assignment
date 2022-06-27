package sqlite_operations;

import java.sql.*;

public class DmlOperations {

	public static void main(String[] args) {
		try {	
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/Program Files/sqlite/mydb.db");
			Statement stmt= conn.createStatement();
			stmt.executeUpdate("create table movies(mv_name varhar(10), actor varhar(10), actress varhar(10), release_year int, dir_name varhar(10))");
			stmt.executeUpdate("insert into movies values('kgf','yash','srinidhi',2019,'prashant')");
			stmt.executeUpdate("insert into movies values('rrr','ram charan','aliya',2022,'rajamouli')");
			
			ResultSet rs=stmt.executeQuery("select * from movies");
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			
					}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
