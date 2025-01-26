package week1.day4;

public class LearnString {

	public static void main(String[] args) {
String companyName="Testleaf";
char[] charArray=companyName.toCharArray();
for(int i=charArray.length-1;i>=0;i--) {
	System.out.println(charArray[i]);
}
	}

}
