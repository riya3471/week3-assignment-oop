package week3;

public class BankAccountOverload {
	 int accNo;
	    double balance;

	    public BankAccountOverload() {
	        accNo = 0;
	        balance = 0;
	    }

	    public BankAccountOverload(int a) {
	        accNo = a;
	        balance = 0;
	    }

	    public BankAccountOverload(int a, double b) {
	        accNo = a;
	        balance = b;
	    }

	    public void display() {
	        System.out.println(accNo + " " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccountOverload b1 = new BankAccountOverload();
	        BankAccountOverload b2 = new BankAccountOverload(200);
	        BankAccountOverload b3 = new BankAccountOverload(300, 9000);

	        b1.display();
	        b2.display();
	        b3.display();
	    }

}
