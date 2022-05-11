public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private AbstractPrice price;

    public Movie(String title, AbstractPrice price) {
        this.title = title;
        this.price = price;
    }

    public AbstractPrice getPrice() {
        return price;
    }

    public void setPrice(AbstractPrice price) {
        this.price = price;
    }

    public String getTitle (){
        return title;
    }

    public double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoint(daysRented);
    }
}