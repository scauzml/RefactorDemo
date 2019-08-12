package rentalstore;

public abstract class Statement {

    public String statement(Customer customer) {
        return "";
    }


    public abstract String getHeader();
    public abstract String getEachLine();
    public abstract String addFooter();



}
