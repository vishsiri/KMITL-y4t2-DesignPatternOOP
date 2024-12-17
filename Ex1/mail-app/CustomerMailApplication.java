import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private Customer customer; //aggregation
    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Please choose customer type \n1. Regular \n2. Mountain \n3. Delinquent \n");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        Customer customer  = null;
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
        CustomerMailApplication app = new CustomerMailApplication(customer);
        System.out.println(app.generateMail());        
    }
}
