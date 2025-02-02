package week2.day7;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open Incognito tab");
	}
	public void clearCache() {
		System.out.println("Clear cache");
	}
	
	public static void main(String[] args) {
	Chrome chromeBrowser=new Chrome();
	chromeBrowser.openURL();
	chromeBrowser.openIncognito();
	chromeBrowser.clearCache();
	chromeBrowser.closeBrowser();
	}

}
