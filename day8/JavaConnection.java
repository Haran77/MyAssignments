package week2.day8;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
System.out.println("Connection is done");		
	}

	@Override
	public void disconnect() {
System.out.println("Disconnection is done");		
	}

	@Override
	public void executeUpdate() {
System.out.println("Update is done");		
	}

	@Override
	public void executeQuery() {
System.out.println("Executed Query");		
	}

	public static void main(String[] args) {
JavaConnection javaObj=new JavaConnection();
javaObj.connect();
javaObj.disconnect();
javaObj.executeUpdate();
javaObj.executeQuery();
	}
}
