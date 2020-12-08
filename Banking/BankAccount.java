package Banking;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountNumber(String number){
        this.number = number;
    }

    public String getAccountNumber(){
        return this.number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String customerName){
        this.customerName = customerName;
    }

    public String getName(){
        return customerName;
    }

    public void setEmail(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getEmail(){
        return customerEmailAddress;
    }

    public void setPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getPhoneNumber(){
        return customerPhoneNumber;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is " + this.balance);
    }

    public void withdrawalFunds(double withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }else{
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed. Remaining balance is " + this.balance);
        }
    }
}
