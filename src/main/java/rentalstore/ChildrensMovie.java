package rentalstore;

public class ChildrensMovie extends Movie {

    public ChildrensMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (dayRented > 3) {
            thisAmount += (dayRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
