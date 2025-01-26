package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
int[] a= {3,2,11,4,6,7};
int[] b= {1,2,8,4,9,7};

for(int i=0;i<=a.length-1;i++) {
if(a[i]==b[i]) {
System.out.println(a[i]+" is the matching element");
}
}
}
}