import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class garagebill {
    private Map<String , Customer> customersmap;
    private List<Services> availservices;


    public garagebill() {
        this.customersmap = new HashMap<>();
        this.availservices = new ArrayList<>();
        loadservices();
    }
    public void loadservices(){
        availservices.add(new Services("Car Wash",500));
        availservices.add(new Services("Oil Change",700));
        availservices.add(new Services("Puncture",50));
        availservices.add(new Services("Tyre Replacement",5000));
        availservices.add(new Services("Wheel Allignment",100));
    }

    Scanner d = new Scanner(System.in);

    public void addCustomers(String name, int contact, String carnumber, String model){
    Car c  = new Car(carnumber,model);
    Customer customer = new Customer(name,c,contact);
    customersmap.put(carnumber,customer);
        System.out.println("Customer added sucessfully!");
    }

    public void createInvoice(String carno){
         if(!customersmap.containsKey(carno)){
             System.out.println("No car found with car number :"+carno);
             return;
         }
         Customer customer = customersmap.get(carno);
         Invoice invoice = new Invoice(customer);
        System.out.println("Available Services :");
         for(int i = 0 ; i<availservices.size();i++){
             System.out.println((i+1)+". "+availservices.get(i).getName()+"- $"+availservices.get(i).getPrice());
         }
         while(true){
             System.out.println("Enter Service Number to Add!! (Press 0 to finish the process)");
             int ch = d.nextInt();
             if(ch==0) break;
             if(ch>0&&ch<=availservices.size()){
                invoice.addservices(availservices.get(ch-1));
                 System.out.println("Service Done!");
             }
             else{
                 System.out.println("Invalid Choice!");
             }
         }
         invoice.printinvoice();
    }
}
