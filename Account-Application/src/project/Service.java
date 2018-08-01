package project;

import java.util.HashMap;
import java.util.Map;

public class Service {

	HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();

	public void addAccount(Account acc) {
		accountList.put(accountList.size() + 1, acc);
	}

	public Account retrieveAccount(String firstName) {

		for (Map.Entry<Integer, Account> a : accountList.entrySet()) {
			if (a.getValue().getFirstName().equals(firstName)) {
				return a.getValue();
			}
		}
		return null;
	}

	public Account retrieveAccount(int accNumber) {

		for (Map.Entry<Integer, Account> a : accountList.entrySet()) {
			if (a.getValue().getAccountNumber()==accNumber) {
				return a.getValue();
			}
		}
		return null;

	}

}
