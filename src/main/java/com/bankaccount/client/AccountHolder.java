package com.bankaccount.client;

public class AccountHolder implements Runnable {
	private Account account;

	public AccountHolder(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 4; i++) {
			makeWithdrawal(2000);
			if (account.getBalance() < 0) {
				System.out.println("Account is Overdrawn!");
			}
		}

	}

	private synchronized void makeWithdrawal(int withdrawAmount) {
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() + "is going to withdraw" + withdrawAmount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() + "completes the withdrawal of" + withdrawAmount);
		} else {
			System.out.println(
					"Not Enough Account for " + Thread.currentThread().getName() + "to withdraw" + withdrawAmount);
		}
	}
}
