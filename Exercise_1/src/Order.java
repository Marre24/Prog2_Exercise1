import java.util.Arrays;
import java.util.List;

public class Order
{
    private final long orderNumber = 1;
    private long counter;
    private final List<Item> items;
    public Order(Item... items)
    {
        this.items = Arrays.asList(items);
    }

    public double getTotalValue()
    {
        double tot=0;

        for (Item item : items)
            tot += item.getPrice();

        return  tot;
    }

    public double getTotalValuePlusVAT()
    {
        double tot=0;

        for (Item item : items)
            tot += item.getPriceWithVAT();

        return  tot;
    }

    public String getReceipt() {
        StringBuilder stringBuilder = new StringBuilder("Receipt for order #" + orderNumber + "\n" + "-----------\n");
        for (Item item : items)
            stringBuilder.append(item.toString()).append("\n");
        stringBuilder.append("Total excl. VAT: ").append(getTotalValue()).append("\n");
        stringBuilder.append("Total incl. VAT: ").append(getTotalValuePlusVAT());
        return stringBuilder.toString();
    }
}
