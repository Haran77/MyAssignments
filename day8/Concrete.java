package week2.day8;

public class Concrete implements DatabaseConnection{
		
	@Override
	public void connect() {
System.out.println("Connection is successfull");		
	}

	@Override
	public void disconnect() {
System.out.println("Disconnected");		
	}

	@Override
	public void executeUpdate() {
System.out.println("Update is done");
	}

	public static void main(String[] args) {
		Concrete dbObj=new Concrete();
		dbObj.connect();
		dbObj.disconnect();
		dbObj.executeUpdate();
	}
}
