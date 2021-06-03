/*
In Downcasting, the reference of the parent class object is passed to the child class.
Implicitly Downcasting is not possible. Only Explicit Downcasting is possible.
Link : https://www.javatpoint.com/upcasting-and-downcasting-in-java
*/

package Inheritance_Interview_Questions;

	class Parent1 
	{   
	    String name;   
	    
	    // A method which prints the data of the parent class   
	    void showMessage()   
	    {   
	        System.out.println("Parent method is called");   
	    }   
	}   
	    
	// Child class   
	class Child1 extends Parent1 
	{   
	    int age;   
	     
	    void showMessage()   
	    {   
	        System.out.println("Child method is called");   
	    }   
	}   
	    
	public class DowncastingExample
	{  
	    public static void main(String[] args)   
	    {   
	    	// Performing Upcasting implicitily
	        Parent1 p = new Child1();  
	        p.name = "Shubham";  
	          
	        // Performing Downcasting Implicitly   
	        // Child1 c = new Parent1(); // it gives compile-time error   
	          
	        // Performing Downcasting Explicitly   
	        Child1 c = (Child1)p;   
	    
	        c.age = 18;   
	        System.out.println(c.name);   
	        System.out.println(c.age);   
	        c.showMessage();   
	    }   
}  
