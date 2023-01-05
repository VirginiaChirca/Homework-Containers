package containers;

public class Address {
    private String strada;
    private String oras;
    private Country tara;

    public Address(String strada, String oras, String numeTara) {
        this.strada = strada;
        this.oras = oras;
        this.tara = new Country(numeTara);
    }

    public String getStrada() {
        return strada;
    }

    public String getOras() {
        return oras;
    }

    public Country getTara() {
        return tara;
    }

    public void setTara(Country tara) {
        this.tara = tara;
    }

}