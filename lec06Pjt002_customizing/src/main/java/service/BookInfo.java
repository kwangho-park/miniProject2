package service;

public class BookInfo {
	
	private String bookName = "미등록자";
	private String writer = "히가시노 게이고";
	
	// constructor
	public BookInfo() {}

	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
