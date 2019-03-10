/* bean 객체 
 * spring container에 생성됨
 * */

package service;

public class PostInfo {

	private int number = 1;
	private String title = "인생 띵작";

	private BookInfo bookInfo;
	
	// constructor
	public PostInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public BookInfo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}	
}
