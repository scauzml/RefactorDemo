package rentalstore;

public class RegularMovie extends Movie {

    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
