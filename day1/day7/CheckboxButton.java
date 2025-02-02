package week2.day7;

public class CheckboxButton extends Button{

	public void clickCheckButton() {
		System.out.println("Check box button is clicked");
	}
	public static void main(String[] args) {
		
		CheckboxButton checkBox=new CheckboxButton();
		checkBox.clickCheckButton();
		checkBox.click();
		checkBox.submit();
		System.out.println(checkBox.setText("Check box button has been clicked"));

	}

}
