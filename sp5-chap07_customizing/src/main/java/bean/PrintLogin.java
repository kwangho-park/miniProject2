// bean // 

package bean;

public class PrintLogin implements Print{


	public PrintLogin(){}
	
	@Override
	public void print() {
		System.out.println("[login] validation and filtering at DB");
	}
	
};
