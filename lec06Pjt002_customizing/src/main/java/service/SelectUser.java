/* baen 객체 
 * spring container에 생성됨
 * */

package service;

public class SelectUser {

	private String phone = "010-xxxx-xxxx";
	
	public SelectUser() {}
	
	// 출력 method
	public void printName(){
		System.out.println("user name : 박보영");
	}

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
