package week1.day3;

import java.util.Arrays;

public class FindDupes {

	public static void main(String[] args) {
int[] numbers= {2,5,7,7,5,9,2,3};
		
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		
int[] dupNumbers= {2,2,3,5,5,7,7,9};
int numLength=dupNumbers.length;
for(int i=0; i<numLength-1; i++) {
	if(dupNumbers[i]==dupNumbers[i+1]) {
		System.out.println(dupNumbers[i]+" The value is duplicate");
	}
}
	}

}
