package core.view;

import java.util.Scanner;

public class Read {
	private Scanner scan;
	
	public Read() {
		scan = new Scanner(System.in);
	}
	
	public int readInt() {
		return scan.nextInt();
	}
	
	public double readDouble() {
		return scan.nextDouble();
	}
	
	public String readString() {
		return scan.next();
	}
	
	public void readNextLine() {
		scan.nextLine();
	}
}
