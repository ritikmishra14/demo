package objectAndClass;
class Account{
	String name;
	float amount;
	int accNo;
	
	void insert(String name, float amount, int accNo) {
		this.name=name;
		this.amount=amount;
		this.accNo=accNo;
		
	}
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt + ": deposited");
		
	}
	void withdraw(float amt) {
		if(amt>amount) {
			System.out.println("insufficient balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+ ": withdrawn");
		}
}
	void checkBalance() {
		System.out.println("balance: "+ amount);
	}
}

public class ClassTwo {

	public static void main(String[] args) {
		//Banking system account example.
		Account user=new Account();
		user.insert("Sam",10000 , 123);
		user.deposit(1000);
		user.checkBalance();
		
		user.withdraw(500);
		
		user.checkBalance();
		

	}

}
