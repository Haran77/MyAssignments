package week3.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssignment {

	public static void main(String[] args) {
String companyName="google";

//To convert the string into character array
char[] charName=companyName.toCharArray();
System.out.println(charName[0]);

//Create a Set with return type as Character
Set<Character> unique=new LinkedHashSet<Character>();

//Iterate using for loop to add elements from character array to Set
for(int i=0;i<charName.length;i++) {
unique.add(charName[i]);
	}
System.out.println("Set : "+unique);
	}
}
