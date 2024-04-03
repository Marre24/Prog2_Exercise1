public class Book extends Item implements PriceableWithVAT6
{
    private static final double BOUNDED_PRICE = 1.3;
    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    @Override
    public double getPrice() {
        if (bound)
            return price * BOUNDED_PRICE;
        return price;
    }

    @Override
    public double getVAT() {
        return 0.06;
    }

    @Override
    public double getPriceWithVAT() {
        return getPrice() * (1 + 0.06);
    }

    @Override
    public String toString() {
        return "[Book, "  + getPrice() + ", " + bound + getName() + ", " + getPriceWithVAT() +
                ", " + author + ", " + getName() + " ]";
    }
}
