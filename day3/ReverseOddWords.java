package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
	String test = "I am a software tester";
	String[] words = test.split(" ");

	for (int i = 0; i < words.length; i++) {
	if (i % 2 == 1) {
		words[i] = new StringBuilder(words[i]).reverse().toString();
 }
}
System.out.println("Output: " + String.join(" ", words));
}
}

//Need to know some alternate methods to solve this problem without using StringBuilder