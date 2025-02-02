package week2.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
Integer[] a={3, 2, 11, 4, 6, 7};

List<Integer> list1=new ArrayList<>(Arrays.asList(a));

int size=list1.size();
System.out.println("Size of List: "+size);

Collections.sort(list1);
System.out.println("List: "+list1);

System.out.println("Second largest number from the given list is: "+ list1.get(4));


	}

}