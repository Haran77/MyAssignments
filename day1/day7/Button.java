package week2.day7;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submit button is clicked");
	}
	
	public static void main(String[] args) {
Button buttonObj=new Button();
buttonObj.click();
buttonObj.submit();
System.out.println(buttonObj.setText("Button has been clicked"));
	}

}
