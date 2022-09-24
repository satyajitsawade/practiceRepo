package methodHinding;

public class Child extends Parent{
	
	public static void m1() {
		System.out.println("Child static method");
	}

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.m1();
		

	}

}
