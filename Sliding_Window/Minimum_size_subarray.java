package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Minimum_size_subarray {
	
	
	static Integer getsum(List<Integer> subList) {
		Integer sum=0;
		for(int e : subList) {
			sum += e;
		}
		return sum;
	}
	static int find(Integer[] arr,int target) {
		List<Integer> list = Arrays.asList(arr);
		int start =0;
		int end=start;
		int sum=0;
		int size=Integer.MAX_VALUE;
		while (end < list.size()) {
		    
		    sum = Minimum_size_subarray.getsum(list.subList(start, end + 1)); 

		    if (sum == target) {
		        int gap = end - start + 1;
		        if (gap < size) {
		            size = gap;
		        }
		        end++;
		    } else if (sum > target) {
		        start++;
		    } else {
		        end++;
		    }
		}
		if (size == Integer.MAX_VALUE)
			return 0;
		else
			return size;
	}
	
   public static void main(String args[]) {
	
	   Scanner sc = new Scanner(System.in); 
       System.out.print("Enter the size of the array: ");
       int size = sc.nextInt();
       Integer[] arr = new Integer[size];
       System.out.println("Enter " + size + " elements:");
       for(int i = 0; i < size; i++) {
           System.out.print("Element " + (i+1) + ": ");
           arr[i] = sc.nextInt();
       }
       System.out.println("enter target");
       int target = sc.nextInt();
       
       int result=find(arr, target);
       System.out.println(result);
   }
}
