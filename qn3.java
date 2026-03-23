package week3;

 class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;


    public BankAccount(int accNo, double bal, String name, String address) {
        this.accountNumber = accNo;
        this.balance = bal;
        this.accountHolderName = name;
        this.accountHolderAddress = address;
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
    }
    
