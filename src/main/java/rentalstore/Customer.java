package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    double totalAmount = 0;
    int frequentRenterPoints = 0;

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getThisAmount).sum();
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public String statement() {

        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : this.rentals) {
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getThisAmount() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    protected int getFrequentRenterPoints() {
        for (Rental each : this.rentals) {
            frequentRenterPoints+= each.calculateFrequentRenterPoints(this);
        }
        return frequentRenterPoints;
    }

    public String htmlStatement() {

        StringBuilder html = new StringBuilder();
        html.append("<H1>Rentals for <EM>" + this.name + "</EM></H1><P>\n");
        for (Rental each : this.rentals) {
            html.append(each.getMovie().getTitle() + ": " + each.getThisAmount() + "<BR>\n");

        }
        html.append("<P>You owe<EM>" + this.getTotalAmount() + "</EM><P>\n");
        html.append("On this rental you earned <EM>" + this.getFrequentRenterPoints() + "</EM> frequent renter points<P>");

        return html.toString();

    }


}
