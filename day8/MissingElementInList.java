package week2.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
//Declaring an array	
Integer[] missingElement= {1,2,3,4,10,6,8};

//Converting an array into list using Arrays.asList() method
List<Integer> missingElementList=new ArrayList<>(Arrays.asList(missingElement));

//Finding the size of the list and printing it in the console
int sizeOfList=missingElementList.size();
System.out.println("Size of List: "+sizeOfList);

//Sorting of missingElementList
Collections.sort(missingElementList);

System.out.println(missingElementList);

for(int i=0;i<sizeOfList-1;i++) {
	if(missingElementList.get(i)+1!=missingElementList.get(i+1)) {
		System.out.println(missingElementList.get(i)+1 + " is the missing element");
	
	}
}

}

}
