package Banking;

public class Main {
    public static void main(String[] args){
        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        // bobsAccount.setAccountNumber("12345");
        // bobsAccount.setBalance(0.00);
        // bobsAccount.setName("Bob Brown");
        // bobsAccount.setEmail("myemail@bob.com");
        // bobsAccount.setPhoneNumber("(087) 123-4567");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawalFunds(100.00);

        bobsAccount.depositFunds(50.00);
        bobsAccount.withdrawalFunds(100.00);

        bobsAccount.depositFunds(51.00);
        bobsAccount.withdrawalFunds(100.00);
    }
}
