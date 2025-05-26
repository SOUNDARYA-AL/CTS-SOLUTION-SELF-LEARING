 Basic JDBC Connection:

import java.sql.*; public class JDBCConnect { public static void main(String[] args) throws Exception { Connection c = DriverManager.getConnection("jdbc:sqlite:test.db"); ResultSet rs = c.createStatement().executeQuery("SELECT * FROM students"); while (rs.next()) System.out.println(rs.getString(1)); } }
