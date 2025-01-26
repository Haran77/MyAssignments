package week1.day4;

public class StringDuplicates {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		String[] words=text.split(" ");
int count;
		int len=words.length;
	System.out.println(len);
	for(int i=0;i<len;i++) {
	     count = 1;
    if (words[i].equals("")) {
    continue;
         }
   for (int j = i + 1; j < words.length; j++) {
    if (words[i].equalsIgnoreCase(words[j])) { 
 words[j] = "";
 count++;
  }
}
}
StringBuilder result = new StringBuilder();
for (String word : words) {
if (!word.equals("")) { 
 result.append(word).append(" ");
}
 }
  System.out.println("Output: " + result.toString().trim());
}
}

//Need to know some alternate methods to solve this problem without using StringBuilder