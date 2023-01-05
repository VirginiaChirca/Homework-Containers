package containers;
import java.util.List;
public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String name, int frequency, Address... addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = List.of(addresses);
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void printCountries() {
        List<Address> addresses = getAddresses();
        System.out.println("Tari in care " + getName() + " se practica :");
        for (Address adresa : addresses) {
            System.out.println(" - " + adresa.getTara().getName());
        }
    }
}
