package rentalstore;

public abstract class Movie {
//    public static final int CHILDRENS = 2;
//    public static final int REGULAR = 0;
//    public static final int NEW_RELEASE = 1;
   private int type;
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        this.type=priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
    public abstract  double getThisAmount(int dayRented);

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
