package LearnInheritance;

public class LearnAccessspecifier {

	public void m1()
	{
		System.out.println("I am from public method");
	}
	
	protected void m2() {
		System.out.println("I am from protected method");
	}
	
	private void m3() {
		System.out.println("I am from private method");
	}
	
	void m4() {
		System.out.println("I am from default method");
	}
	
	public static void main(String[] args) {
		
		LearnAccessspecifier scope=new LearnAccessspecifier();
		
		
	}

}
