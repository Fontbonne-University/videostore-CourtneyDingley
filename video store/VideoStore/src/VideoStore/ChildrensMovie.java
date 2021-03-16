package VideoStore;

public abstract class ChildrensMovie extends Movie{
	public ChildrensMovie(String title, int CHILDRENS) {
		super(title, CHILDRENS);
	}

	double determineAmount(int daysRented, int priceCode) {
		double rentalAmount = 1.5;
			if (daysRented > 3)
				rentalAmount += (daysRented - 3) * 1.5;
	
		return rentalAmount;
	}

	int determineFrequentRenterPoints(int daysRented, int priceCode) {
		return 1;
	}

}
