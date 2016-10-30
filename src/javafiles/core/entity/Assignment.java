package javafiles.core.entity;

public class Assignment {
	int id;
	int subject_id;
	String time;
	double marks;
	String discription;
	
	public Assignment(){
		
	}
	
	public Assignment(int id, int subject_id, String time, double marks, String discription) {
		super();
		this.id = id;
		this.subject_id = subject_id;
		this.time = time;
		this.marks = marks;
		this.discription = discription;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSubject_id() {
		return subject_id;
	}


	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public String getDiscription() {
		return discription;
	}


	public void setDiscription(String discription) {
		this.discription = discription;
	}


	
	
}
