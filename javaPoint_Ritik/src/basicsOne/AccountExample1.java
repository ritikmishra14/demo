
package basicsOne;

class Account {
	int accNo;
	String name;
	float amount;

	public float deposit(float depositAmount) {
		amount = amount + depositAmount;
		return amount;
	}

	public float withdraw(float withdrawMoney) {
		amount = amount - withdrawMoney;
		return amount;
	}

	public void displayAccInfo() {
		System.out.println(name + " has " + accNo + " accNo " + amount + " amount in bank");
	}
}

public class AccountExample1 {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.name = "sam";
		a1.accNo = 10987;
		a1.amount = 87654.8f;
		a1.displayAccInfo();

		System.out.println("balance after deposit " + a1.deposit(4500.76f));

		System.out.println("balance after withdraw " + a1.withdraw(900.87f));

	}

}
