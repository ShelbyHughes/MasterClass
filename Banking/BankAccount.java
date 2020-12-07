package Banking;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String name;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public long depositFunds(long deposit){
        return this.balance += deposit;
    }

    public void withdrawlFunds(long withdrawl){
        if(this.balance - withdrawl > 0){
            System.out.println(this.balance -= withdrawl);
        }else{
            System.out.println("Insufficiant Funds");
        }
    }
}
