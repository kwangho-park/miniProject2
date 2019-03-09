/* dependency 객체 */

package service;

public class SelectUser {

	private String phone = "phone : 010-xxxx-xxxx";
	
	public SelectUser() {}
	
	public void printName(){
		System.out.println("user name : 박보영느님");
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
