package VideoStore;
public abstract class Movie
{
	
	public static int NEW_RELEASE;
	private String title;
	
	public Movie (String title, int priceCode) {
		this.title = title;
	}
		
	public String getTitle () {
		return title;
	}
	
	abstract double determineAmount(int daysRented);
	
	abstract int determineFrequentRenterPoints(int daysRented);
}