package week1.day1;

public class Login {

	String username = "test";// instance/class variable -->specific to the class
	String password = "leaf";

	// accessspecifier returntype methodName(inputArgument-0 to n)

	public void enterUsername() {
		System.out.println("Entered the username as testleaf" + username);
	}

	public void enterPassword() {
		System.out.println("Entered the password as password");
	}

	public int noOfUsers() {
		int y = 5;
		int x = 10;// local variable-->specific to the method
		return x + y;
	}

	public boolean newUser() {
		System.out.println(username);
		return false;
	}

	public int add(int x, int y) {
		// local variable-->specific to the method
		return x + y;
	}

	public void clickLogin() {
		System.out.println("Clicked Login Successfully");
	}

	public static void main(String[] args) {

		// Classname Object=new Classname();

		String username = "vidya";
		Login credentialsFb = new Login();

		// obj.methodName
		System.out.println(credentialsFb.username);
		System.out.println(credentialsFb.password);

		credentialsFb.enterUsername();
		credentialsFb.enterPassword();
		credentialsFb.clickLogin();

		int users = credentialsFb.noOfUsers();
		int manipulateNumber = users + 10;
		System.out.println(manipulateNumber + " from the noOfUser" + users);

		System.out.println(credentialsFb.add(25, 35));

	}

}
