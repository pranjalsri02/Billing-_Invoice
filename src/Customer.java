public class Customer {
    private String name;
    private Car car;
    private int phone;

    public Customer(String name, Car car, int phone) {
        this.name = name;
        this.car = car;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public int getPhone() {
        return phone;
    }
}
