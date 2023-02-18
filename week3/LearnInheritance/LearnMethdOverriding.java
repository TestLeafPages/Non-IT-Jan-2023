package LearnInheritance;

public class LearnMethdOverriding extends LearnMethodOverLoading {

	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void add() {
		System.out.println("Working on addition factor from child class");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnMethdOverriding obj=new LearnMethdOverriding();
		obj.add(2, 20);
		obj.add();
		obj.add(0, null);
		obj.add(null, 0);
	}

}
