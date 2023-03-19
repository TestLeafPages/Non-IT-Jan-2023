package learnExceptionHandling;

public class LearnSuper extends ParentClass{

	public void myHouse() {
		super.myHouse();
		System.out.println("Individual Villa");
		
	}
	
	
	public static void main(String[] args) {
		LearnSuper obj=new LearnSuper();		
		obj.myHouse();

	}

}
