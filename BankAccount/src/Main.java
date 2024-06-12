import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        BankAccount bobsAccount = new BankAccount(); //( "12345", 0.00, "Bob Brown", "myemail@bobbrown.com", "(312) 653-4074");
       /* bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCusustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("(312) 653-4074");
        */

        System.out.println("Here is customer name: " + bobsAccount.getCustomerName());
        System.out.println("Here is customer name: " + bobsAccount.getCustomerEmailAddress());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);
        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);

        VipPerson person1 = new VipPerson();
        System.out.println("here is person1: " + person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println("here is person2: " + person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println("here is person 3: " + person3.getName());
        System.out.println("here is email: " + person3.getEmailAddress());
    }
}