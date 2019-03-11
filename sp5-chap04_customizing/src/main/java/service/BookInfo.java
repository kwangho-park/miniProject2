/* bean 객체 
 * spring container에 생성됨
 * postInfo객체에 injection
 * */

package service;

public class BookInfo {
	
	private int ISBN = 1234567;
	private String bookName = "미등록자";

	// constructor
	public BookInfo() {}


	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
}
