package module2.task3.exercise3;

import org.w3c.dom.ls.LSOutput;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Ivan", Gender.MALE);
        System.out.printf("%d, %s, %s %n",customer.getId(), customer.getName(),customer.getGender());
        System.out.println(customer.toString());
    }
}
