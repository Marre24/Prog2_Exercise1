public class LongPlay extends Recording {
    private static final double THIS_YEAR = 2024;

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (THIS_YEAR - getYear()) * 5.0;
    }

    @Override
    public String getType() {
        return "LP";
    }
}
