package methodhiding;

public class ChildClass extends SuperClass {

	public static void staticMethod() {
		System.out.println("I am staticMethod in ChildClass ");//Hiding
	}
	public void instanceMethod(int a) {
		System.out.println("I am instanceMethod in ChildClass "+a);//Overriding
	} 

	public static void main(String[] args) {

		SuperClass sup = new SuperClass();
		ChildClass child = new ChildClass();
		
		sup.staticMethod();
		sup.instanceMethod();
		
		child.staticMethod();
		child.instanceMethod(1);
		
		
		
	}

}
