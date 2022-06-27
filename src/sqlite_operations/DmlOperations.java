package sqlite_operations;

import java.sql.*;

public class DmlOperations {

	public static void main(String[] args) {
		try {	
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/Program Files/sqlite/mydb.db");
			Statement stmt= conn.createStatement();
			stmt.executeUpdate("create table movies(mv_name varhar(20), actor varhar(20), actress varhar(20), release_year int, dir_name varhar(20))");
			stmt.executeUpdate("insert into movies values('kgf','yash','srinidhi',2019,'prashant')");
			stmt.executeUpdate("insert into movies values('rrr','ram charan','aliya bhatt',2022,'rajamouli')");
			stmt.executeUpdate("insert into movies values('john wick','keanu reaves','Bridget',2014,'Chad')");
			stmt.executeUpdate("insert into movies values('premam','nivin pauly','sai pallavi',2015,'Alphonse')");
			stmt.executeUpdate("insert into movies values('vikram','kamal hasan','Swathishta',2022,'lokesh')");
			
			ResultSet rs=stmt.executeQuery("select * from movies");
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			System.out.println("Yash Movies");
			rs=stmt.executeQuery("select * from movies where actor='yash'");
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			
					}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
