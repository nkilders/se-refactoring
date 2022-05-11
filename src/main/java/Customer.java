import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration<Rental> enumeration = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";

        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enumeration.hasMoreElements()) {
            Rental rental = enumeration.nextElement();
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + rental.getCharge() + "\n";
        }

        //add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    private double getTotalCharge() {
        double totalCharge = 0.0d;

        Enumeration<Rental> enumeration = rentals.elements();
        while(enumeration.hasMoreElements()) {
            totalCharge += enumeration.nextElement().getCharge();
        }

        return totalCharge;
    }

    private int getTotalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;

        Enumeration<Rental> enumeration = rentals.elements();
        while(enumeration.hasMoreElements()) {
            totalFrequentRenterPoints += enumeration.nextElement().getFrequentRenterPoints();
        }

        return totalFrequentRenterPoints;
    }
}