package mypack;

import java.util.*;

public class DAO {

	public static List<Users> ExportUsers() {

		List<Users> list = new ArrayList<Users>();

		list.add(new Users("Hieu", "Teacher"));
		list.add(new Users("Minh", "student"));
		list.add(new Users("tham", "web"));

		return list;
	}

	public static List<Student> ExportStudent() {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "Hieu"));
		list.add(new Student(2, "Minh"));
		list.add(new Student(3, "tham"));
		list.add(new Student(4, "hao"));
		list.add(new Student(5, "son"));
		list.add(new Student(6, "dung"));
		list.add(new Student(7, "chien"));
		return list;
	}
}
