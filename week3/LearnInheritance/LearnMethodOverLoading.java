package LearnInheritance;

public class LearnMethodOverLoading {
	
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add() {
		System.out.println("Working on addition factor");
	}
	
	public void add(String s,int y) {
		System.out.println(s +y);
	}

	
	public void add(int y,String s) {
		System.out.println(s +y);
	}

	
	public static void main(String[] args) {
		
		LearnMethodOverLoading overload=new LearnMethodOverLoading();
		
		overload.add();
		overload.add(10, 20);
		overload.add("multiple funtionality", 2);

	}

}
