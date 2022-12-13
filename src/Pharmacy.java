import java.time.LocalDate;
import java.util.Date;

public class Pharmacy {

    public String name;
    public double price;
    public int quantity;
    public LocalDate expirationDate;

    public Pharmacy(String name, double price, int quantity, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public Pharmacy() {

    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}