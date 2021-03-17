package Arrays;

import java.util.Arrays;

//Find a pair with the given sum in an array
//Input:
//arr = [8, 7, 2, 5, 3, 1]
//sum = 10
//Output:
// pair found at index 0 and 2 (8 + 2)
// or
// Pair found at index 1 and 4 (7 + 3)

public class PairWithGivenSum {

	public static void main(String[] args) {
		
		int[] arr = {8,7,2,5,3,1,9};
		int sum = 10;
		
		pairSum(arr, sum);

	}

	private static void pairSum(int[] arr, int sum) {
		Arrays.sort(arr);
		Arrays.toString(arr);
		int low =0;
		int high = arr.length-1;
		
		while(low<high){
			if(arr[low]+arr[high]==sum)
				System.out.println("pair found at index "+ low +" and "+high);
			if(arr[low]+arr[high]>sum)
				high--;
			else
				low++;
		}
	}

}
