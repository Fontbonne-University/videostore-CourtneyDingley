import java.util.Vector;
import java.util.Enumeration;

public class Statement {
	private double totalAmount;
	private int frequentRenterPoints;
	private String CustomerName;
	private List<Rental> rentals = new ArrayList<Rental>();
	
	public Statement (String CustomerName) {
		this.customerName = name;
	}
	
	public void addRental (Rental rental) {
		rentals.add(rental);
	}
	
	public String getCustomerName () {
		return customerName;
	}
	
	public String generate() {
		clearTotals();
		String statementText = header();
		statementText += rentalLines();
		statementText += footer();
		return statementText;
	}
	
	public double getTotal() {
		return totalAmount;
	}
	
	public int getFrequentRenterPoints() {
		return frequentRenterPoints;
	}
	
	private void clearTotals() {
		totalAmount = 0;
		frequentRenterPoints = 0;
	}
	
	private String header() {
		return String.format("Rental Record for %s\n", customerName);
	
	}
	
	private String rentalLines() {
		String rentalLines = "";
		for(Rental rental : rentals ) 
			rentalLines += rentalLine(rental);
	
		return rentalLines;
	}
	
	private String rentalLine(Rental rental) {
		String rentalLine = "";
		double rentalAmount = rental.determineAmount();
		frequentRenterPoints += rental.determineFrequentRenterPoints();
		totalAmount += rentalAmount;
		
		return formatRentalLine(rental, rentalAmount);
	}
	

	
	private String formatRentalLine(Rental rental, double rentalAmount) {
		return String.format("\t&s\t%.1f\n", rental.getTitle(), rentalAmount);
	}
	

	private String Footer() {
		return String.format("You owed %.1f\n" +
				"You earned %d frequent renter points\n", 
						totalAmount, frequentRenterPoints);
	}
}