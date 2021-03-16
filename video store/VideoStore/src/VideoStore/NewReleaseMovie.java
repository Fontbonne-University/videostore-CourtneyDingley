package VideoStore;

public abstract class NewReleaseMovie extends Movie {
	public NewReleaseMovie(String title) {
		super(title, Movie.NEW_RELEASE);
	}

	double determineAmount(int daysRented) {
		return daysRented * 3;
	}
	

	int determineFrequentRenterPoints(int daysRented, int priceCode) {
		return (daysRented >1) ? 2 : 1;
			
	}

}
