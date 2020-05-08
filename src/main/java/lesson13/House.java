package lesson13;

public class House {
    private Address address;
    private int bedrooms;
    private int bathrooms;
    private double square;
    private Refrigirator refrigirator;
    private Computer computer;

    public House(Address address, int bedrooms, int bathrooms, double square, Refrigirator refrigirator, Computer computer) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square = square;
        this.refrigirator = refrigirator;
        this.computer = computer;
    }

    public House(Address address, int bedrooms, int bathrooms, double square, Computer computer) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.square = square;
        this.computer = computer;
    }

    public Address getAddress() {
        return address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public double getSquare() {
        return square;
    }

    public Refrigirator getRefrigirator() {
        return refrigirator;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setRefrigirator(Refrigirator refrigirator) {
        this.refrigirator = refrigirator;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}




