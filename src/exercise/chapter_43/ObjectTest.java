package exercise.chapter_43;

public class ObjectTest {

    public static void main(String[] args) {
        Customer customer = new Customer("마동석");

        System.out.println(customer);

        GoldCustomer customer2 = new GoldCustomer("철민");
        System.out.println(customer2);

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("아이유");

        System.out.println(staff);
        System.out.println(vipCustomer);
    }
}
