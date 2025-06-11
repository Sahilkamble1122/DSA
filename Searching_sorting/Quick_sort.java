package searching_sorting;

import java.util.Arrays;

public class Quick_sort {

	static void Quick_Sort(int a[],int start,int end)
    {
        int i=start;
        int j=end;
        int pivot=start;
        while(i<j)
        {
            while(a[i]<a[pivot])//inactive i=pivot
                i++;
            while(a[j]>a[pivot])
                j--;
            if(i<j)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        if(i<end)//skip to first
            Quick_Sort(a,start+1,a.length-1);
        if(start<j)//skip to first
            Quick_Sort(a,start,end-1);
    }
	public static void main(String[] args) {
	    int[] a = {10, 25, 5, 40, 15, 30, 20};

	    System.out.println("Array has:"+Arrays.toString(a));//print original
	    Quick_Sort(a,0,a.length-1);
	    System.out.println("Array has:"+Arrays.toString(a));//print original//print sorted

	}
}
