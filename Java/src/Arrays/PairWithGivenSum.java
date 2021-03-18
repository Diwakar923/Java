package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(hm.containsKey(sum-arr[i])){
				System.out.println("Pair found at index "+hm.get(sum-arr[i])+" and "+ i);
			}
			else{
				hm.put(arr[i], i);
			}
		}
	}

}
