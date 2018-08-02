package testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import project.Account;
import project.Service;

public class JSONtest {

	@Test
	public void JSONtests() {
		Service service = new Service();

		Account acc1 = new Account("John", "Mills", 12345);
		service.addAccount(acc1);
		System.out.println(service.toJSON());

	}
}
