//sliding window
//max no in the given size of window
 
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class window{
	static List<Integer> fun(List<Integer> list,int k) {
	  int start= 0;
	  int end= k-1;
	  List<Integer>max = new ArrayList<>();
	   for(int i=0 ; i<=list.size()-k;i++) {  
       max.add(Collections.max(list.subList(start, end + 1)));
       start++;
       end++;
	   }
	   return max;
	}
}

public class sliding_window {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        Integer[] arr = new Integer[size];
	        System.out.println("Enter " + size + " elements:");
	        for(int i = 0; i < size; i++) {
	            System.out.print("Element " + (i+1) + ": ");
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("enter window size");
	        int win = sc.nextInt();
	        
	        List<Integer> list = Arrays.asList(arr);
	        
	        
	        List<Integer> result =  window.fun(list, win);
	        
	        System.out.println(result);
	        
	 }

}
