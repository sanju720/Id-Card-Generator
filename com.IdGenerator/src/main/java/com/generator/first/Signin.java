package com.generator.first;

public class Signin {
	private String Username;
	private int Contactno;
	private String Email;
	private int Password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getContactno() {
		return Contactno;
	}
	public void setContactno(int contactno) {
		Contactno = contactno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Signin [Username=" + Username + ", Contactno=" + Contactno + ", Email=" + Email + ", Password="
				+ Password + "]";
	}
	public Signin(String username, int contactno, String email, String Password) {
		super();
		Username = username;
		Contactno = contactno;
		Email = email;
		Password = Password;
	}
	public Signin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
