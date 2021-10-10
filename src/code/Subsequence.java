package code;

public class Subsequence {

	public static void main(String[] args) {
		int[] arr1 = {5, 6, 22, 25, 1, -1, 8, 10};
		int[] arr2 = {1, 6, -1, 10};
		System.out.println(isSubsequence(arr1, arr2));

	}

	private static boolean isSubsequence(int[] arr1, int[] arr2) {
		int j = 0;
		int i = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;
			} else if (arr1[i] != arr2[j]) {
				i++;
			}
		}
		
		if(j == arr2.length)
			return true;
		else
			return false;
	}

}
