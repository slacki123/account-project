package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import project.Account;
import project.Service;

public class AccountTest {

	@Test
	public void setFirstNameTest() {
		Account acc = new Account("Jon", "Mills", 12345);
		acc.setFirstName("John");
		assertEquals("Wrong name", "John", acc.getFirstName());
	}

	@Test
	public void setLastNameTest() {
		Account acc = new Account("Jon", "Mills", 12345);
		acc.setLastName("John");
		assertEquals("Wrong name", "John", acc.getLastName());
	}

	@Test
	public void setAccountNumberTest() {
		Account acc = new Account("Jon", "Mills", 12345);
		acc.setAccountNumber(1234);
		assertEquals("Wrong name", 1234, acc.getAccountNumber());
	}

	@Test
	public void retrieveAccountTest() {
		Service service = new Service();

		Account acc1 = new Account("John", "Mills", 12345);
		service.addAccount(acc1);

		assertNull("Name should not be found", service.retrieveAccount("NullName"));
		assertEquals("Account not found", service.retrieveAccount("John").toString(),
				"Name = John Mills, Account number = 12345");
		assertEquals("Account not found", service.retrieveAccount(12345).toString(),
				"Name = John Mills, Account number = 12345");
	}

	@Test
	public void retrieveAccountTest2() {
		Service service = new Service();

		Account acc1 = new Account("John", "Mills", 12345);
		service.addAccount(acc1);

		assertNull("Name should not be found", service.retrieveAccount(0));
		assertNull("Name should not be found", service.retrieveAccount("NullName"));

	}

	@Test
	public void countNamesTest() {

		Service service = new Service();

		Account acc1 = new Account("John", "Mills", 12345);
		service.addAccount(acc1);
		service.addAccount(new Account("Mike", "Myers", 3243));
		service.addAccount(new Account("John", "Bowie", 234235));
		service.addAccount(new Account("John", "Bowide", 24235));
		service.addAccount(new Account("John", "Bowider", 24235));

		assertEquals("Name should not be found", 4, service.countNames("John"));

	}
	
	@Test
	public void JSONtest() {
		
	}

}
