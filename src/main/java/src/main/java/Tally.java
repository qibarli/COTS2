package src.main.java;

public class Tally {

	private int total;
	
	public Tally() {
		this.initialize();
	}
		
	public void initialize() {
		total = 0;
	}
	
	public void add() {
		total++;
	}
	
	public void subtract() {
		total--;
	}
	
	public int getTotal() {
		return total;
	}
	
}
