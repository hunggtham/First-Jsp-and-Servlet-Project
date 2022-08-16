package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import bean.Province;
import bean.Student;

public class HomeDAO {
	
	public static List<Province> DisplayProvince(Connection conn){
		
		List<Province> list = new ArrayList<Province>();
		String sql ="select * from province";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()) {
				Province province = new Province();
				int provinceId = rs.getInt("provinceid");
				String provinceName = rs.getString("provinceName");
				
				province.setProvinceId(provinceId);
				province.setProvinceName(provinceName);
				
				list.add(province);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public static boolean InsertStudent(Connection conn, Student stt) {
		PreparedStatement ptmt = null;
		String sql = "insert into student(studentname,provinceid) values (?,?);";
		
		try {
			ptmt = conn.prepareStatement(sql);
			
			int provinceId = stt.getProvinceId();
			String studentName = stt.getStudentName();
			
			ptmt.setString(1, studentName);
			ptmt.setInt(2, provinceId);
			
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
