package Arrays;

import java.util.Arrays;

//Print all consecutive subarrays with 0 sum
//Input:  { 4, 2, -3, -1, 0, 4 }
//
//Subarrays with zero-sum are
// 
//{ -3, -1, 0, 4 }
//{ 0 }
// 
// 
//Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
// 
//Subarrays with zero-sum are
// 
//{ 3, 4, -7 }
//{ 4, -7, 3 }
//{ -7, 3, 1, 3 }
//{ 3, 1, -4 }
//{ 3, 1, 3, 1, -4, -2, -2 }
//{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }


public class PrintAllSubArraysWithZEROSum {

	public static void main(String[] args) {
		int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		SubArrayWithZeroSum(arr);
	}

	private static void SubArrayWithZeroSum(int[] arr) {
		int sum;
		for(int i=0; i<arr.length-1;i++){
			sum = 0;
			sum += arr[i];
			if(sum==0){
				printSubArray(arr,i,i);
			}
			for(int j=i+1;j<arr.length;j++){
				sum += arr[j];
				if(sum==0){
					printSubArray(arr,i,j);
				}
			}
		}
	}

	private static void printSubArray(int[] arr, int i, int j) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
	}
	 

}
