package javafiles.core.entity;

public class Subject {
	private int id;
	private String name;
	private int No_Of_Asgs;
	private String teacher;
	
	
	
	public Subject(String name, int noOfAsgs, String teacher) {
		super();
		this.id = 1;
		this.name = name;
		No_Of_Asgs = noOfAsgs;
		this.teacher = teacher;
	}
	
	
	public Subject() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfAsgs() {
		return No_Of_Asgs;
	}
	public void setNoOfAsgs(int noOfAsgs) {
		No_Of_Asgs = noOfAsgs;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	

}
