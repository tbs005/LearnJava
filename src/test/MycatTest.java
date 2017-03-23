package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JDBC连接MyCat
 * JDK1.8
 */
public class MycatTest {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://192.168.3.178:8066/employees1";
	    String username = "root";
	    String password = "123456";
	    Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			String sql = "select year(t.from_date) as year,title,count(*) from titles as t  group by year,t.title;";
			String sql2 = "select count(*) count from employees;";
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()){
//				rs.getString("year");
				System.out.println(rs.getString("year"));
			}
			
			prepareStatement.close();
	        conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
