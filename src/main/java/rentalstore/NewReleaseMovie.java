package rentalstore;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double  getThisAmount(int dayRented) {
        double thisAmount = 0;
        thisAmount += dayRented * 3;
        return thisAmount;
    }
}
