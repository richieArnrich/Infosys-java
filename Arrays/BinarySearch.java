package Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {2,4,8,16,20,32};
		int key = 8;
		binarySearch(arr, key);
	}
	
	public static void binarySearch(int arr[],int key) {
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid] == key) {
				System.out.println("Element found at index "+ mid);
				return;
			}else if(key>arr[mid]) {
//				consider the right part of array
				i = mid+1;
			}else{
//				consider the left part of array
				j = mid-1;
			}
		}
	}
}
