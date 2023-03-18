package excelIntegration;

public class LearnStatic {

	public static void method1() {
		
		System.out.println("From Static method");
	}
	
   public   void method2() {
		
		System.out.println("From normal method");
	}
	
	
	public static void main(String[] args) {
		
      method1();
      LearnStatic obj=new LearnStatic();
      obj.method2();
		
	}

}
