package week3;

public class customer {
    private int id;
    private String name;
    private BankAccount acc;

    public customer(int i, String n, BankAccount a) {
        id = i;
        name = n;
        acc = a;
    }

    public String getName() { return name; }
    public BankAccount getAccount() { return acc; }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, 5000, "Riya", "Nepal");

        customer c = new customer(1, "Riya", a1);

        System.out.println(c.getName());
        System.out.println(c.getAccount().getBalance());
    }
}


