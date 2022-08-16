package dao;

public class LoginDAO {

	public static boolean Validate(String pass) {
		boolean test = false;
		if(pass.equals("123")) {
			test = true;
		}
		
		return test;
	}
}
