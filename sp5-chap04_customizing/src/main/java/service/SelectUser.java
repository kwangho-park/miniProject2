/* baen 객체 
 * spring container에 생성됨
 * */

package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SelectUser {

	private String phone = "010-xxxx-xxxx";
	private LoginUser loginUser;					// [추가] dependency 객체의 참조값을 저장하기위한 참조변수
	
	// constructor
	public SelectUser() {}
	

	// 출력 method
	public void printName(){
		System.out.println("user name : 박보영");
	}

	
	public LoginUser getLoginUser() {
		return loginUser;
	}
	
	@Autowired										// [추가] : dependency 객체를 명시
	@Qualifier("login")
	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
