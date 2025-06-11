import java.util.Scanner;


public class garageapp {
    public static void main(String [] args){
        garagebill gb = new garagebill();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("-----------Car Service Centre-----------");
            System.out.println("1.Add Customer\n2.Display Services\n3.Exit\nEnter your Choice!");
            int  ch = scan.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the name :");
                    String name = scan.next();
                    System.out.println("Enter Contact Number");
                    int No = scan.nextInt();
                    System.out.println("Enter Car Number");
                    String carno = scan.next();
                    System.out.println("Enter the Car Model");
                    String model = scan.next();
                    gb.addCustomers(name,No,carno,model);
                    break;
                case 2:
                    System.out.println("Enter Car Number");
                    String carn = scan.next();
                    gb.createInvoice(carn);
                    break;
                case 3:
                    System.out.println("Exiting.....Thank You!");
                    System.exit(0);
                    scan.close();
                default :
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
