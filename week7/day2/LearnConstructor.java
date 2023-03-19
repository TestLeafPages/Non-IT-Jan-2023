package learnExceptionHandling;

public class LearnConstructor {

	int x;
	String name;
	
	public LearnConstructor() {//no arg constructor
		System.out.println("I am from no argument constructor");
	}
	
	public LearnConstructor(int a,String name) {//no arg constructor
		this();
		this.name=name;
		System.out.println("I am from parametrized constructor " +a +" -->" +name);
	}
	public LearnConstructor(String s,String name) {//no arg constructor
		this(1,"Vidya");
		this.name=name;
		System.out.println("I am from parametrized constructor " +s +" -->" +name);
	}
	
	
	
	public static void main(String[] args) {	
		
   //default constructor
   		LearnConstructor obj1=new LearnConstructor("Emp","Bala");
		 LearnConstructor obj=new LearnConstructor();
		System.out.println(obj.x);
	System.out.println(obj1.name);

	}

}
