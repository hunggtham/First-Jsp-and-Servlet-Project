package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Account;

public class RegisterDAO {

	public static boolean InsertAccount(Connection conn, Account account) {
		PreparedStatement ptmt = null;
		String sql = "insert into account(uname,pass) values (?,?);";
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			String uname = account.getUname();
			String pass = account.getPass();
			
			ptmt.setString(1, uname);
			ptmt.setString(2, pass);
			
			int kt = ptmt.executeUpdate();
			
			if(kt != 0) {
				
				return true;
			}
			ptmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}
