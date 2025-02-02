package week2.day7;

public class Edge extends Browser {

	public void takeSnap() {
			System.out.println("Take snap");
		}
		public void clearCookies() {
			System.out.println("Clear cookies");
		}
		
		public static void main(String[] args) {
		Edge edgeBrowser=new Edge();
		edgeBrowser.openURL();
		edgeBrowser.takeSnap();
		edgeBrowser.clearCookies();
		edgeBrowser.closeBrowser();
	}

}
