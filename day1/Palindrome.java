package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
int input = 12321; 
int original = input; 
int output = 0;
   for(int i = input; i > 0; i /= 10) {
	 int rem = i % 10; 
       output = (output * 10) + rem;
 }
   if(original == output) {
  System.out.println(original + " is a Palindrome.");
 } 
   else{
	   System.out.println(original + " is not a Palindrome.");
}
 }
  }
