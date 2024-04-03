public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public double getPrice() {
        if (price * ((double)condition / 10) < 10)
            return 10;
        return price * ((double)condition / 10);
    }

    @Override
    public double getPriceWithVAT() {
        return getPrice() * (1 + getVAT());
    }

    protected double getOriginalPrice(){
        return price;
    }

    @Override
    public double getVAT() {
        return 0.25;
    }

    @Override
    public String toString() {
        return "[" +
                this.getName() + ", " +
                getYear() + ", " +
                getPriceWithVAT() + ", " +
                getArtist() + ", " +
                getCondition() + ", " +
                price + ", " +
                getType() + ", "  +
                getPrice() +
                "]";
    }
}
