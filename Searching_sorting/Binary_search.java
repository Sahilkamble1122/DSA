package searching_sorting;


public class Binary_search {
	public static int binary_search(int a[], int start, int end, int key) {
	    if (start <= end) {
	        int mid = (start + end) / 2;

	        if (a[mid] == key) {
	            return mid;
	        } else if (a[mid] < key) {
	            return binary_search(a, mid + 1, end, key); 
	        } else {
	            return binary_search(a, start, mid - 1, key); 
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		 int[] a = {1,3,7,10,12,16,19,20};
		 int temp = binary_search(a,0,a.length-1,12);
		 if (temp == -1) {
			 System.out.println("element not found");
		 }
		 else {
			System.out.println("element found at index :"+temp);
		}
	}
}
