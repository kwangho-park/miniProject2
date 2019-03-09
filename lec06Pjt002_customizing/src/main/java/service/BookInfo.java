/* dependency 객체 
 * spring container에 injection
 * postInfo객체에 injection
 * */

package service;

public class BookInfo {
	
	private String bookName = "미등록자";
       
	// constructor
	public BookInfo() {}

	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
