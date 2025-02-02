package week2.day7;

public class LoginTestData extends TestData{

	public void enterUserName() {
		System.out.println("Enter username");
	}
	public void enterPassword() {
		System.out.println("Enter password");
	}
	public static void main(String[] args) {
LoginTestData loginObj=new LoginTestData();
loginObj.enterUserName();
loginObj.enterPassword();
loginObj.enterCredentials();
loginObj.navigateToHomePage();
	}

}
