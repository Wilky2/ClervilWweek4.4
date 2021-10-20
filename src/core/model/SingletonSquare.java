package core.model;

public class SingletonSquare {
	double cote;
	
	public static SingletonSquare square = new SingletonSquare(0);

	private SingletonSquare(double cote) {
		super();
		this.cote = cote;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
	public double surface() {
		return cote*cote;
	}
	
	public double perimeter() {
		return cote*4;
	}	
}