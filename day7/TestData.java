package week2.day7;

public class TestData {

	public void enterCredentials() {
		System.out.println("Credentials are entered");
	}

	public void navigateToHomePage() {
		System.out.println("Navigated to Home Page");
	}
	public static void main(String[] args) {
	TestData TestDataObj=new TestData();
	TestDataObj.enterCredentials();
	TestDataObj.navigateToHomePage();
}

}
