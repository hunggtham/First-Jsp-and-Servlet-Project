package mypack;

public class Student {
	private String name;
	private int num;
	
	
	
	public Student(int num,String name ) {
		super();
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
