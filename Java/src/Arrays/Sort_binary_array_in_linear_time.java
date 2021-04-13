package Arrays;

import java.util.Arrays;

//
//
//Sort binary array in linear time
//
//
//Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }
// 
//Output: { 0, 0, 0, 0, 1, 1, 1, 1 }

public class Sort_binary_array_in_linear_time {

	public static void main(String[] args) {

		int arr[] ={1,0,0,1,1,1,0,0,1,0,1};
		int res[] = sortInLinear(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] sortInLinear(int[] arr) {
		int temp[] = new int[arr.length];
		int i=0,j=arr.length-1;
		for(int val : arr){
			if(val==0)
				temp[i++]=val;
			else
				temp[j--]=val;
			
		}
		return temp;
	}

}
