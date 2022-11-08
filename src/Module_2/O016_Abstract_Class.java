/*
 * Create an abstract class 'Parent' with a method 'message'. It has two 
	subclasses each having a method with the same name 'message' that 
	prints "This is first subclass" and "This is second subclass" respectively. 
	Call the methods 'message' by creating an object for each subclass.
 */

package Module_2;

abstract class Parent1 {
	public abstract void message();

	public void run() {
		System.out.println("Perent class.....");
	}
}

class sub1 extends Parent1 {
	public void message() {
		System.out.println("This is first subclass");
	}
}

class sub2 extends Parent1 {
	public void message() {
		System.out.println("This is second subclass");
	}
}

public class O016_Abstract_Class {
	public static void main(String[] args) {

		sub1 s1 = new sub1();
		s1.message();
		s1.run();

		sub2 s2 = new sub2();
		s2.message();
	}
}
