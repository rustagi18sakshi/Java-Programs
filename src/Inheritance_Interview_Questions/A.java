package Inheritance_Interview_Questions;

public class A {

	public A() {
		System.out.println("I am in A");
	}

	public A(String name) {
		System.out.println("Printing name in A :" + name);
	}

	public void sum(int a, int b) {
		System.out.println("Sum is " + (a + b));
	}
}
