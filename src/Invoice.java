import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Services> servicesList;
    private double totalamount;

    public Customer getCustomer() {
        return customer;
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public Invoice(Customer customer) {
        this.customer = customer;
        this.servicesList = new ArrayList<>();
        this.totalamount = 0;
    }

    public void addservices(Services services) {
        servicesList.add(services);
        totalamount += services.getPrice();
    }

    public void printinvoice() {
        System.out.println("-------------Invoice------------- ");
        System.out.println("Customer : " + customer.getName() + " | " + "Contact Number : " + customer.getPhone() + " | " + "Car :" + customer.getCar().getModel() + " | " + "Car Number :" + customer.getCar().getCarNo());
        for (Services services : servicesList) {
            System.out.println("#"+services.getName()+" : $"+services.getPrice());
        }
        System.out.println("Total Amount : "+totalamount);
        System.out.println("-------------Thank You!-------------");
    }
}