import java.util.List;

public class Main {
    public static void main(String[] args){
        Customer phil = new Customer(0, "Phil");
        CustomerDatabase db = new CustomerDatabase();
        List<Customer> customers = db.getCustomers();
        //customers.add(phil);
        try {
            db.addCustomer(phil);
        } catch (IllegalAccessException e){
            System.out.println("Caught exception");
        }

        for (Customer c: db.getCustomers()){
            System.out.println(c);
        }

        //CustomerDatabase.Companion.helloWorld();
        CustomerDatabase.helloWorld();
    }
}
