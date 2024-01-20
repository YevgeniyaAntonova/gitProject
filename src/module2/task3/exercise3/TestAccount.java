package module2.task3.exercise3;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(01, "Yevgeniya", Gender.FEMALE);
        Account account = new Account(001, customer, 1000 );
        System.out.println(account.toString());
        System.out.printf("%d, %s, %f, %s %n", account.getId(), account.geCustomerName(), account.getBalance(), customer.getGender());
        System.out.println(account.deposit(2000));
        System.out.println(account.withdraw(500.32));
        System.out.println(account.withdraw(6000));
    }
}
