package review;

import java.util.Scanner; //allows for keyboard input

public class ReviewFeb04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); //create scanner object
		String name = "Truong";
		
		//prompt
		System.out.print("Enter your Name: ");
		name = input.next();//storing a String 
		
		System.out.print("enter your age: ");
		int age = input.nextInt();//storing a int
		
		System.out.print("enter height: ");
		double h = input.nextDouble();//store a double
		
		System.out.println(name + "\n " + age + " " + h);
		
  }
}
