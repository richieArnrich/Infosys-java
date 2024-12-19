package Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {5,4,1,3,2};
		int keyElement = 1;
		int index = linearSearch(arr, keyElement);
		if(index == -1) {
			System.out.println("Element is not found");
		}else {
			System.out.println("Element found at index "+ index);
		}
	}
	
	public static int linearSearch(int arr[], int keyElement) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == keyElement) {
				return i;
			}
		}
		return -1;
	}
}
