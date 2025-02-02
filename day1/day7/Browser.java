package week2.day7;

public class Browser {

	public void openURL() {
		System.out.println("Open URL");
	}
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	public void navigateBack() {
		System.out.println("Navigate back");
	}
	
	public static void main(String[] args) {
Browser browserOptions=new Browser();
browserOptions.openURL();
browserOptions.closeBrowser();
browserOptions.navigateBack();
	}
}
