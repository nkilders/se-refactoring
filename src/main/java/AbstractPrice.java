public abstract class AbstractPrice {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoint(int daysRented) {
        return 1;
    }
}