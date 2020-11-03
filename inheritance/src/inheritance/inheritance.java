package inheritance;
abstract class A{
	public abstract void getA();
	public void displayA() {
		System.out.println("displays A method of class A");
	}
}
class B extends A{
	public void getA() {
		System.out.println("Method of A class");
	}
	public void displayB() {
		System.out.println("Method of B class");
	}
}
public class inheritance {
	public static void main(String[] args ) {
		B obj=new B();
		obj.getA();
		obj.displayA();
		obj.displayB();
	}

}
