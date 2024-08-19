package Day09.Ex06_UserException;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 만원 입금
		account.deposit(10000);
		
		// 2만원 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}
}
