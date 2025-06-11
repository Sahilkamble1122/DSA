package searching_sorting;

import java.util.Arrays;

public class Bubble {
	   static void Bubble_Sort(int a[]) {
	       for (int i = a.length - 1;i<0; i--)//passes
	       {
	    	   Boolean flag = true;//optimized
	           for (int j = 0; j < a.length - 1; j++)//sort
	           {
	        	   
	               if (a[j] > a[j + 1]) {
	                   int t = a[j];
	                   a[j] = a[j + 1];
	                   a[j + 1] = t;
	                   flag=false;
	               }
	           }//j end
	           if(flag) {
	        	   break;
	           }
	       }//i end
	   }


	   public static void main(String[] args) {
	       int[] a = {10, 25, 5, 40, 15, 30, 20};
	       
	       for(int i: a){
	    	   System.out.println(i);//print original
	       }
	       
	       Bubble_Sort(a);
	       //print sorted
	       System.out.println(Arrays.toString(a));//optimized


	   }
	}

