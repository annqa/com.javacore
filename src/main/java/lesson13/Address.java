package lesson13;

public class Address {
    private PersonalName name;
    private String streetAddress;
    private String state;
    private int zip;
    private String city;

    public Address(PersonalName name, String streetAddress, String state, int zip, String city){
        this.name=name;
        this.streetAddress=streetAddress;
        this.state=state;
        this.zip=zip;
        this.city=city;
    }

    public PersonalName getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public void setName(PersonalName name) {
        this.name = name;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }
}




