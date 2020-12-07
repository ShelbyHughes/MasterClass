package Banking;

public class main {
    public static void main(String[] args){
        BankAccount bank = new BankAccount();
        bank.setAccountNumber(1234567);
        bank.setBalance(1200000);
        bank.setName("John Smith");
        bank.setEmail("j.smith@gmail.com");
        bank.setPhoneNumber(2101002000);
        System.out.println("New Additional Balance= " + bank.depositFunds(500));
        System.out.println("New Withdrawl Balance= ");
        bank.withdrawlFunds(1300000);
    }
}