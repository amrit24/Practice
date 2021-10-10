package code;

public class SubArraySumK {

	public static void main(String[] args) {
		int[] arr = {3, 4, 7, 2 ,-3, 1, 4, 2};
		int k = 7;
		
		System.out.println(totalSubArraysEqualsToK(arr,k));

	}
	
	private static int totalSubArraysEqualsToK(int[] arr, int k) {
		int count = 0;
		
		for(int i=0; i<arr.length;i++) {
			int sum = 0;
			for(int j=i; j<arr.length;j++) {
				sum+=arr[j];
				if(sum == k) {
					count++;
				}
			}
			
		}
		
		return count;
	}

}
