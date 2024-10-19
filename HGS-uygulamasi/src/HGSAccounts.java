import java.util.ArrayList;
import java.util.List;

public abstract class HGSAccounts {
    protected String firstName;
    protected String lastName;
    protected String idNumber;
    protected String vehicleClass;
    protected double balance;
    protected List<HGSPassages> passagesList = new ArrayList<>();

    public HGSAccounts(String firstName, String lastName, String idNumber, String vehicleClass, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.vehicleClass = vehicleClass;
        this.balance = balance;
    }

    public abstract void addBalance(double amount);
    public abstract void deductBalance(double amount);
    public abstract void displayAccountInfo();
}
