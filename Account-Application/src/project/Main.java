package project;

public class Main {
	
	public static void main(String[] args) {
		Service service = new Service();
		service.addAccount(new Account("1", "2", 3));
		service.getHashMap().get(1);
		service.getHashMap().clear();
		service.getHashMap().get(1);
	}

}
