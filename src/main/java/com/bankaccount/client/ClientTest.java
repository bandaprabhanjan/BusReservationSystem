package com.bankaccount.client;

public class ClientTest {

	public static void main(String[] args) {
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder,"Jack1");
		Thread t2 = new Thread(accountHolder,"Joya1");
		/*
		 * t1.setName("Jack"); t2.setName("Joya");
		 */
		t1.start();
		t2.start();

	}

}
//Notes: Here, Account object is sharable by 2 threads
 
