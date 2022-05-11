public class PriceNewRelease extends AbstractPrice {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3.0;
    }

    @Override
    public int getFrequentRenterPoint(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}