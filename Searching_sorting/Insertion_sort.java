package searching_sorting;

import java.util.Arrays;

public class Insertion_sort {
	static void Insertion_Sort(int a[])
    {
        for (int i =0;i<a.length-1;i++)
        {
            int new_element=a[i+1];
            int j=i+1;
           while(j>0 && a[j-1]>new_element)
           {
               a[j]=a[j-1];//bring back
               j--;
            }
            a[j]=new_element;
        }//i
    }

public static void main(String[] args) {
    int[] a = {10, 25, 5, 40, 15, 30, 20};

    System.out.println("Array has:"+Arrays.toString(a));//print original
    Insertion_Sort(a);
    System.out.println("Array has:"+Arrays.toString(a));//print original//print sorted

}
}