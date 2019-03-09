/* dependency 객체 
 * spring container에 injection
 * */

package service;

public class PostInfo {

	private String title = "인생 띵작";
	private int number = 1;
	
	private BookInfo bookInfo;
	
	// constructor
	public PostInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	
	public String getTitle() {
		return title;
	}
	public void setUserName(String title) {
		this.title = title;
	}

	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	public BookInfo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}	
}
