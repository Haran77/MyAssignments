package week2.day7;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("Get text");
	}
	public static void main(String[] args) {
		TextField textObj=new TextField();
		textObj.click();
		textObj.getText();
		System.out.println(textObj.setText("Text field has been found and filled"));
		
	}

}
