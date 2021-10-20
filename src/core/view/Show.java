package core.view;


public abstract class Show {
	
	public static void menu() {
				display("1. How to reverse Singly Linked List?");
				display("2. Find out duplicate number between 1 to N numbers.");
				display("3. Find out middle index where sum of both ends are equal.");
				display("4. Write a singleton class.");
				display("5. Write a program to reverse a string using recursive algorithm.");
				display("6. Write a program to reverse a number.");
				display("7. Write a program to convert decimal number to binary format.");
				display("8. Write a program to find perfect number or not.");
				display("9. Write a program to implement ArrayList.");
				display("10. Write a program to find maximum repeated words from a file.");
	}
	
	public static void display(String a) {
		System.out.println(a);
	}
}
