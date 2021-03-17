package Arrays;

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
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(i==4)
					System.out.println("**");
				if(arr[i]+arr[j]==sum)
					System.out.println("pair found at index "+ i +" and "+j);
			}
		}
	}

}
