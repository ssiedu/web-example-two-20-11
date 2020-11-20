package com.ssi;

public class CodeInfo {
	private String author;
	private String company;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public CodeInfo(String author, String company) {
		super();
		this.author = author;
		this.company = company;
	}
	
	
}
