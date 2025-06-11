package searching_sorting;


public class linear_search {
	static int Sequential_search(int a[],int key)
	{
	 for(int i=0;i<a.length;i++)
		{
		 if(key==a[i])//found
			return i;
		}
	 return -1;
	} 

	public static void main(String[] args) {
		 int[] a = {10, 25, 5, 40, 15, 30, 20};
		 int temp = Sequential_search(a, 2);
		 if (temp == -1) {
			 System.out.println("element not found");
		 }
		 else {
			System.out.println("element found at index :"+temp);
		}
	}
}
