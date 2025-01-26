package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
    int start = -1, end = 8;
 int[] fib = new int[end + 1]; 
 fib[0] = 0;
 fib[1] = 1;
 for (int i = 2; i <= end; i++) {
 fib[i] = fib[i - 1] + fib[i - 2];
  }
System.out.print("Fibonacci Series from -1 to 8: ");
 System.out.print("-1 ");
 for (int i = 0; i <= end-1; i++) {
System.out.print(fib[i] + " ");
  }
 }
}