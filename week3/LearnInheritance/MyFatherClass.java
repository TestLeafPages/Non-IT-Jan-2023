package LearnInheritance;

public class MyFatherClass extends MyGrandfather{

	public void land() {
		System.out.println("1550sqft");
	}
	
	public static void main(String[] args) {
		MyFatherClass use=new MyFatherClass();
		use.independentHouse();
		use.flat();
		use.land();
		
		
	}
	
	
}
