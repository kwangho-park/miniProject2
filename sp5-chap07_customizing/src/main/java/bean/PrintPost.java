// bean //

package bean;

public class PrintPost implements Print{

	public PrintPost() {}
	
	@Override
	public void print() {
		System.out.println("[write post] validation and INSERT data at DB");
	}
	
}
