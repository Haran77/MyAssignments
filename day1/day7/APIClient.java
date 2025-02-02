package week2.day7;

public class APIClient {
	
	public String sendRequest(String endpoint) {
		return endpoint;
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + requestBody + requestStatus);
	}
	public static void main(String[] args) {
APIClient apiObj=new APIClient();
System.out.println(apiObj.sendRequest("Facebook"));
apiObj.sendRequest("https://en-gb.facebook.com/ ","Email and Password ", true);
	}

}

