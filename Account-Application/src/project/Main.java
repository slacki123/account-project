package project;

import java.util.HashMap;

import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {


		Service service = new Service();

		Account acc1 = new Account("John", "Mills", 12345);
		service.addAccount(acc1);
		service.addAccount(new Account("Mike", "Myers", 3243));
		
		JSONObject json = new JSONObject(service.getHashMap());
		System.out.println(json);

	}

}
