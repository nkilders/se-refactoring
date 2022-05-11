public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle (){
        return title;
    }

    public double getCharge(int daysRented) {
        double charge = 0;

        switch (this.priceCode) {
            case Movie.REGULAR:
                charge += 2;

                if (daysRented > 2)
                    charge += (daysRented - 2) * 1.5;

                break;

            case Movie.NEW_RELEASE:
                charge += daysRented * 3;

                break;

            case Movie.CHILDREN:
                charge += 1.5;

                if (daysRented > 3)
                    charge += (daysRented - 3) * 1.5;

                break;
        }

        return charge;
    }
}