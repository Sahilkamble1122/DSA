package searching_sorting;

import java.util.Arrays;

public class Merge_sort {
	static void merge_sort(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }
    static void merger(int a[],int start,int mid,int end)
    {
        int i,j;
        i=start;
        j=mid+1;
        int temp[]=new int[a.length];
        int tindex=start;
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
                temp[tindex++]=a[i++];
            else
                temp[tindex++]=a[j++];
        }
        while(i<=mid)
            temp[tindex++]=a[i++];
        while(j<=end)
            temp[tindex++]=a[j++];
        for(i=start;i<=end;i++)
            a[i]=temp[i];
    }
    
	public static void main(String[] args) {
	    int[] a = {10, 25, 5, 40, 15, 30, 20};

	    System.out.println("Array has:"+Arrays.toString(a));//print original
	    merge_sort(a,0,a.length-1);
	    System.out.println("Array has:"+Arrays.toString(a));//print original//print sorted

	}
	
}
