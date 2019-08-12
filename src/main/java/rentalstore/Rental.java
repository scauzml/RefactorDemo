package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double  getThisAmount() {
        double thisAmount = this.movie.getThisAmount(this.dayRented);
        return thisAmount;
    }

    int calculateFrequentRenterPoints(Customer customer) {

        //add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == 1) && getDayRented() > 1) {
           return 2;
        }
        return 1;
    }
}
