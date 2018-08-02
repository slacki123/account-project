package project;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {

	private static HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
	
	
	

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

		for (Account a : accountList.values()) {
			if (a.getAccountNumber()==accNumber) {
				return a;
			}
		}
		return null;

	}
	
	public HashMap<Integer, Account> getHashMap() {
		return new HashMap<Integer, Account>(accountList);
	}
	
	public int countNames(String firstName) {
		int counter = 0;
		for (Map.Entry<Integer, Account> a : accountList.entrySet()) {
			if (a.getValue().getFirstName().equals(firstName)) {
				counter++;
			}
		}
		return counter;
	}

}
