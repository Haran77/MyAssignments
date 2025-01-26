package week1.day3;

public class MethodsAndObject {
	public String addBook() {
		return "A Dog's Purpose";
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
MethodsAndObject addingBooks=new MethodsAndObject();
MethodsAndObject issuingBooks=new MethodsAndObject();
System.out.println(addingBooks.addBook());
System.out.println("Book added successfully");
issuingBooks.issueBook();

	}

}
