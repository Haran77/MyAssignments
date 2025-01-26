package week1.day4;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
String odd="changeme";
char[] charArray=odd.toCharArray();
int len=odd.length();
System.out.println(len);

for(int i=len-1;i>=0;i--) {
	if(i%2!=0) {
		charArray[i] = Character.toUpperCase(charArray[i]);
	}
	}
String result = new String(charArray);
System.out.println(result);
}
}