package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void testStatement() {
        Movie newReleaseMovie = new Movie("Titanic", 1);
        Rental twoDayRental = new Rental(newReleaseMovie, 2);
        Customer customer = new Customer("lance");
        customer.addRental(twoDayRental);
        String statement = customer.statement();
        assertEquals("Rental Record for lance\n" +
                "\t" + newReleaseMovie.getTitle() + "\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);
    }
}