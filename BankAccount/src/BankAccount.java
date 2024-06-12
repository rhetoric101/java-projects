import java.sql.SQLOutput;

public class BankAccount {
    private String number;
    private double depositAmount;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //Create an empty constructor here to handle the case where no parameters are supplied:
    //When BankAccount is called without parameters in Main, the empty constructor calls the
    //other bankAccount constructor and uses the default values.
    //Note the special use of "this" which isn't seen anywhere else except in these cases:
    public BankAccount() {
        this("666666", 2.50, "Default name", "Default email", "default phone");
        System.out.println("Empty constructor");


    }

    //Create an overloaded constructor with same name that actually initializes value???
    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + this.depositAmount + " made. New balance is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {
        if (balance-withdrawalAmount <0) {
            System.out.println("Only" + balance + " available. Withdrawal not processed.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String cusustomerEmailAddress) {
        this.customerEmailAddress = cusustomerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}
