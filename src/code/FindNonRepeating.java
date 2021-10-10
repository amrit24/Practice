package code;

import java.util.Arrays;

public class FindNonRepeating {
   //[1,2,2,1,3]
	public static void main(String[] args) {
	   int[] arr = {2,1,3,1,2,5,4,5,4,9,8,9,8};
       System.out.println(findDuplicate(arr));
	}
	
	private static int findDuplicate(int[] arr) {
		Arrays.sort(arr);

		for(int i=0; i<arr.length-1;i+=2) {
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		
		return -1;
	   		
	}

}
