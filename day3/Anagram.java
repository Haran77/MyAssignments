package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String text1="stops";
String text2="potss";

int len1=text1.length();
int len2=text2.length();

if(len1!=len2) {
	System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
}
else {
	System.out.println("Length of the 2 strings are equal");
	char[] charText1=text1.toCharArray();
	char[] charText2=text2.toCharArray();
	Arrays.sort(charText1);
	Arrays.sort(charText2);

if(Arrays.equals(charText1,charText2)) {
System.out.println("The given strings are Anagram");	
}
else {
	System.out.println("The given strings are not an Anagram");
}
}
}
}