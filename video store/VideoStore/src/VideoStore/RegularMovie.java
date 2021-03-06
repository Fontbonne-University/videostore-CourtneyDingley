package VideoStore;

public abstract class RegularMovie extends Movie {
	public RegularMovie(String title, int REGULAR) {
		super(title, REGULAR);
	}

	double determineAmount(int daysRented) {
		double rentalAmount = 2;
			if (daysRented > 2)
				rentalAmount += (daysRented - 2) * 1.5;
			
		return rentalAmount;
	}

	int determineFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
