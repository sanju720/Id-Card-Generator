package com.generator.first;

public class Idinformation {
      private String studentname;
      private String classroom;
      private int rollno;
      private int academicyear;
      private int birthdate;
      private String address;
      private int contactno;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAcademicyear() {
		return academicyear;
	}
	public void setAcademicyear(int academicyear) {
		this.academicyear = academicyear;
	}
	public int getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Idinformation [studentname=" + studentname + ", classroom=" + classroom + ", rollno=" + rollno
				+ ", academicyear=" + academicyear + ", birthdate=" + birthdate + ", address=" + address
				+ ", contactno=" + contactno + "]";
	}
	public Idinformation(String studentname, String classroom, int rollno, int academicyear, int birthdate,
			String address, int contactno) {
		super();
		this.studentname = studentname;
		this.classroom = classroom;
		this.rollno = rollno;
		this.academicyear = academicyear;
		this.birthdate = birthdate;
		this.address = address;
		this.contactno = contactno;
	}
	public Idinformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
      
      
      
}
