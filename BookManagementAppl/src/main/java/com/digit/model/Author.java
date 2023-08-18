package com.digit.model;

public class Author {
	
	private String authorName;
	private int authorId;
	private String authorMobileNum;
	public Author(String authorName, int i, String authorMobileNum) {
		super();
		this.authorName = authorName;
		this.authorId = i;
		this.authorMobileNum = authorMobileNum;
	}
	public Author() {
		super();
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorMobileNum() {
		return authorMobileNum;
	}
	public void setAuthorMobileNum(String authorMobileNum) {
		this.authorMobileNum = authorMobileNum;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorId=" + authorId + ", authorMobileNum=" + authorMobileNum
				+ "]";
	}
	
	

}
