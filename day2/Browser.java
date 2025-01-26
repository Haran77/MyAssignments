package week1.day3;

public class Browser {
	
	public String launchBrowser() { 
		return ("Browser launched successfully");
	}
	
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	
	public int launchChrome() {
return 100;
	}

	public static void main(String[] args) {
		Browser launchMethod=new Browser();
		System.out.println(launchMethod.launchBrowser());
		Browser loadingURL=new Browser();
		loadingURL.loadUrl();
		Browser launchChromeDriver=new Browser();
		System.out.println(launchChromeDriver.launchChrome());
		
	}

}
