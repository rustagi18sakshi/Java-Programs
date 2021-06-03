/*
Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object.
By using the Upcasting, we can easily access the variables and methods of the parent class to the child class.
We can perform Upcasting implicitly or explicitly.
Link : https://www.javatpoint.com/upcasting-and-downcasting-in-java
*/
package Inheritance_Interview_Questions;

	class  Parent
	{  
		   void PrintData() 
		   {  
		      System.out.println("method of parent class");  
		   }  
	}  
	  
	class Child extends Parent 
	{  
	   void PrintData() 
	   {  
	      System.out.println("method of child class");  
	   }  
	}  
	
	class UpcastingExample
	{  
	   public static void main(String args[]) 
	   {  
	        
		  // Implicit upcasting
	      Parent obj1 = new Child();  
	      Parent obj2 = new Child(); 
	      
	      obj1.PrintData();  
	      obj2.PrintData();  
	      
		  // Explicit upcasting
	      Parent obj3 = (Parent) new Child();  
	      Parent obj4 = (Parent) new Child(); 
	      
	      obj3.PrintData();  
	      obj4.PrintData();  
	   }  
	}  
