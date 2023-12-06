import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String email;
    private List<Account> accounts;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
