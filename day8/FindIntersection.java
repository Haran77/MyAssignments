package week2.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
Integer[] a={3, 2, 11, 4, 6, 7};
Integer[] b={1, 2, 8, 4, 9, 7};

//Converting Arrays into 2 Lists using Arrays.asList() method
List<Integer> list1=new ArrayList<>(Arrays.asList(a));
List<Integer> list2=new ArrayList<>(Arrays.asList(b));

//Sorting of lists
Collections.sort(list1);
Collections.sort(list2);

System.out.println("Intersection values: ");

//for loop for getting the intersection values from list1 and list2
for(int i=0;i<list1.size();i++) {
	for (int j = 0; j < list2.size(); j++) {
        if (list1.get(i).equals(list2.get(j))) {  // Compare values
System.out.println(list1.get(i)); 
	}
	}
	}

}
}