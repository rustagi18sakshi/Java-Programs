package Inheritance_Interview_Questions;

/*
 Super() method will be called by default in every default constructor eg in C(){} ,
 	public A()
	{
		System.out.println("I am in A");
	}
	will be called
	
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This will only call method in A class
		A obj1 = new A();

		// Throws compile time error
		// B obj2 = new B();

		// This will call method in A class as well as method in C class(which is empty
		// currently)
		C obj3 = new C();

		// Throws compile time error
		// A obj4 = new B();

		// This will call method in A class as well as method in C class(which is empty
		// currently)
		A obj5 = new C();

		// This will call 2nd method in A class
		A obj6 = new A("Sakshi");

		// This will call super method in A class and 2nd method in C class(which has
		// arguement String)
		A obj7 = new C("Abhinav");

	}

}
