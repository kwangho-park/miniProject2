package service;

public class MemberInfo {

	private String userName;
	private int userAge;
	
	// constructor
	public MemberInfo(String userName, int userAge) {
		this.userName = userName;
		this.userAge = userAge;
	}

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
}
