package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

//	private static void SubArrayWithZeroSum(int[] arr) {
//		int sum;
//		for(int i=0; i<arr.length-1;i++){
//			sum = 0;
//			sum += arr[i];
//			if(sum==0){
//				printSubArray(arr,i,i);
//			}
//			for(int j=i+1;j<arr.length;j++){
//				sum += arr[j];
//				if(sum==0){
//					printSubArray(arr,i,j);
//				}
//			}
//		}
//	}
//
//	private static void printSubArray(int[] arr, int i, int j) {
//		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
//	}
//	 
//	############3Optimized##########
	
	private static void SubArrayWithZeroSum(int[] arr) {
		Map<Integer, List<Integer>> res=new HashMap<Integer, List<Integer>>();
		insert(res,0,-1);
		int sum=0;
		for(int i=0; i<arr.length;i++){
			sum += arr[i];
			if(res.containsKey(sum)){
				List<Integer> list = res.get(sum);
				
				for(int value : list){
					printSubArray(arr,value+1,i);
				}
			}
			insert(res,sum,i);
		}
	}

	private static void insert(Map<Integer, List<Integer>> res, int key, int value) {
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(value);
}

	private static void printSubArray(int[] arr, int i, int j) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
	}
                               
     
}
