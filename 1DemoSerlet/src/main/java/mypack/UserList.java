package mypack;

import java.util.*;

public class UserList {
	public static List ExportUsers() {
		
		List<Users> list = new ArrayList<Users>();
		
		list.add(new Users("hieu", "teacher"));
		list.add(new Users("minh", "developer"));
		
		return list;
		
	}
	
	
}
