package com.bankaccount.client;

public class Account {
	private int balance = 6000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
