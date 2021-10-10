package code;

public class PrintDuplicates {
 
	public static void main(String[] args) {
		String s = "test string aaa bb cc d";
		printDuplicates(s);
	}
	
	private static void printDuplicates(String s) {
		String str = s.replace(" ", "");
		int[] arr = new int[26];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}

		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 1) {
				System.out.println("Character " + (char)(i+97) +" " + arr[i] +" times");
			}
		}
	}
}
