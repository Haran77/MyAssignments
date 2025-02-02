package week2.day7;

public class Safari extends Browser {

	public void readerMode() {
		System.out.println("Reader mode");
	}
	public void fullScreenMode() {
		System.out.println("Full screen mode");
	}
	
	public static void main(String[] args) {
	Safari safariBrowser=new Safari();
	safariBrowser.openURL();
	safariBrowser.readerMode();
	safariBrowser.fullScreenMode();
	safariBrowser.closeBrowser();
	}

}
